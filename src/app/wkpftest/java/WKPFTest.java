import javax.wukong.WKPF;
import javax.wukong.VirtualWuObject;
import javax.wukong.wuclasses.GENERATEDVirtualThresholdWuObject;
import javax.wukong.wuclasses.VirtualThresholdWuObject;

public class WKPFTest {
  private static int passedCount=0;
  private static int failedCount=0;

  private static class VirtualTestWuClass extends VirtualWuObject {
    public static final byte[] properties = new byte[] {
      WKPF.PROPERTY_TYPE_SHORT|WKPF.PROPERTY_ACCESS_READWRITE,
      WKPF.PROPERTY_TYPE_BOOLEAN|WKPF.PROPERTY_ACCESS_READWRITE};

    public void update() {}
  }

  public static void assertEqual(int value, int expected, String message) {
    if (value == expected) {
      System.out.println("OK: " + message);
      passedCount++;
    } else {
      System.out.println("----------->FAIL: " + message);
      System.out.println("Expected: " + expected + " Got: " + value);
      failedCount++;
    }
  }
  public static void assertEqualBoolean(boolean value, boolean expected, String message) {
    if (value == expected) {
      System.out.println("OK: " + message);
      passedCount++;
    } else {
      System.out.println("----------->FAIL: " + message);
      failedCount++;
    }
  }
  public static void assertEqualObject(Object value, Object expected, String message) {
    if (value == expected) {
      System.out.println("OK: " + message);
      passedCount++;
    } else {
      System.out.println("----------->FAIL: " + message);
      failedCount++;
    }
  }

	public static void main(String[] args) {
		System.out.println("WuKong WuClass Framework test");

		WKPF.registerWuClass((short)0x42, VirtualTestWuClass.properties);
		assertEqual(WKPF.getErrorCode(), WKPF.OK, "Registering VirtualTestWuClass as id 0x42.");

		WKPF.registerWuClass((short)0x43, VirtualTestWuClass.properties);
		assertEqual(WKPF.getErrorCode(), WKPF.OK, "... and as id 0x43.");

		VirtualWuObject wuclassInstanceA = new VirtualTestWuClass();
		WKPF.createWuObject((short)0x42, (byte)0x10, wuclassInstanceA);
		assertEqual(WKPF.getErrorCode(), WKPF.OK, "Creating wuobject for wuclass instance A at port 0x10.");

		VirtualWuObject wuclassInstanceB = new VirtualTestWuClass();
		WKPF.createWuObject((short)0x42, (byte)0x10, wuclassInstanceB);
		assertEqual(WKPF.getErrorCode(), WKPF.ERR_PORT_IN_USE, "Creating another wuobject for wuclass instance B at port 0x10, should fail.");

		WKPF.destroyWuObject((byte)0x10);
		assertEqual(WKPF.getErrorCode(), WKPF.OK, "Removing wuclass instance A and wuobject at port 0x10.");

		WKPF.createWuObject((short)0x42, (byte)0x10, wuclassInstanceB);
		assertEqual(WKPF.getErrorCode(), WKPF.OK, "Creating another wuobject for wuclass instance B at port 0x10, now it should work.");

		WKPF.setPropertyShort(wuclassInstanceB, (byte)0, (short)123);
		assertEqual(WKPF.getErrorCode(), WKPF.OK, "Setting property 0 for wuclass instance B to 123.");

		assertEqual(WKPF.getPropertyShort(wuclassInstanceB, (byte)0), 123, "Getting value for property 0 for wuclass instance B, should be 123.");

		WKPF.setPropertyShort(wuclassInstanceA, (byte)0, (short)123);
		assertEqual(WKPF.getErrorCode(), WKPF.ERR_WUOBJECT_NOT_FOUND, "Setting property 0 for wuclass instance A to 123, should fail (A was deleted).");

		WKPF.setPropertyShort(wuclassInstanceB, (byte)1, (short)123);
		assertEqual(WKPF.getErrorCode(), WKPF.ERR_WRONG_DATATYPE, "Setting property 1 for wuclass instance B to 123, should fail (prop 1 is a boolean).");

		WKPF.setPropertyBoolean(wuclassInstanceB, (byte)1, true);
		assertEqual(WKPF.getErrorCode(), WKPF.OK, "Setting property 1 for wuclass instance B to true.");
		assertEqualBoolean(WKPF.getPropertyBoolean(wuclassInstanceB, (byte)1), true, "Getting value for property 1 for wuclass instance B, should be true.");

		WKPF.setPropertyBoolean(wuclassInstanceB, (byte)1, false);
		assertEqual(WKPF.getErrorCode(), WKPF.OK, "Setting property 1 for wuclass instance B to false.");
		assertEqualBoolean(WKPF.getPropertyBoolean(wuclassInstanceB, (byte)1), false, "Getting value for property 1 for wuclass instance B, should be false.");

		VirtualWuObject wuclassInstanceThreshold = new VirtualThresholdWuObject();

		WKPF.registerWuClass(WKPF.WUCLASS_THRESHOLD, GENERATEDVirtualThresholdWuObject.properties);
		assertEqual(WKPF.getErrorCode(), WKPF.OK, "Registering VirtualThresholdWuObject.");

		WKPF.createWuObject((short)WKPF.WUCLASS_THRESHOLD, (byte)0x20, wuclassInstanceThreshold);
		assertEqual(WKPF.getErrorCode(), WKPF.OK, "Creating wuobject for virtual Threshold wuclass at port 0x20.");

		WKPF.setPropertyShort(wuclassInstanceThreshold, WKPF.PROPERTY_THRESHOLD_OPERATOR, WKPF.ENUM_THRESHOLD_OPERATOR_GT);
		assertEqual(WKPF.getErrorCode(), WKPF.OK, "setup initial properties: operator=>");
		WKPF.setPropertyShort(wuclassInstanceThreshold, WKPF.PROPERTY_THRESHOLD_THRESHOLD, (short)1000);
		assertEqual(WKPF.getErrorCode(), WKPF.OK, "setup initial properties: threshold=1000");
		WKPF.setPropertyShort(wuclassInstanceThreshold, WKPF.PROPERTY_THRESHOLD_VALUE, (short)1200);
		assertEqual(WKPF.getErrorCode(), WKPF.OK, "setup initial properties: value=1200");

		wuclassInstanceThreshold.update();
		assertEqualBoolean(WKPF.getPropertyBoolean(wuclassInstanceThreshold, WKPF.PROPERTY_THRESHOLD_OUTPUT), true, "Getting output of virtual threshold wuclass, should be true.");

		WKPF.setPropertyShort(wuclassInstanceThreshold, WKPF.PROPERTY_THRESHOLD_VALUE, (short)1200);
		assertEqual(WKPF.getErrorCode(), WKPF.OK, "setting: value=1200");

		wuclassInstanceThreshold.update();
		assertEqualBoolean(WKPF.getPropertyBoolean(wuclassInstanceThreshold, WKPF.PROPERTY_THRESHOLD_OUTPUT), true, "Getting output of virtual threshold wuclass, should be false.");

		byte[] linkDefinitions = {
		    // Note: Component instance id and wuclass id are little endian
		    // Note: using WKPF constants now, but this should be generated as literal bytes by the WuML->Java compiler.
		    // Connect input controller to threshold
		        (byte)0, (byte)0, (byte)0, (byte)2, (byte)0, (byte)2, (byte)1, (byte)0,
		        (byte)1, (byte)0, (byte)0, (byte)2, (byte)0, (byte)1, (byte)1, (byte)0,
		        (byte)2, (byte)0, (byte)3, (byte)3, (byte)0, (byte)0, (byte)4, (byte)0
		};
		WKPF.loadLinkDefinitions(linkDefinitions);
		assertEqual(WKPF.getErrorCode(), WKPF.OK, "setting link definitions");

		// byte[][] componentInstanceToWuObjectAddrMap = {
		// 			new byte[]{ 6, 2 },
		// 			new byte[]{ 6, 1 },
		// 			new byte[]{ 6, 3 },
		// 			new byte[]{ 4, 1,
		// 						2, 1 },
		// 			};
		byte[] a = { 6, 2 };
		byte[] b = { 6, 1 };
		byte[] c = { 6, 3 };
		byte[] d = { 4, 1, 2, 1 };
		Object[] componentInstanceToWuObjectAddrMap = { a, b, c, d };
		WKPF.loadComponentToWuObjectAddrMap((byte[][])componentInstanceToWuObjectAddrMap);
		assertEqual(WKPF.getErrorCode(), WKPF.OK, "setting component-node map");

		System.out.println("WuKong WuClass Framework test - done. Passed:" + passedCount + " Failed:" + failedCount);
		// while (true) {} // Need loop to prevent it from exiting the program
	}
}
