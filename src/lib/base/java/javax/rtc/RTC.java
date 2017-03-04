package javax.rtc;

public class RTC
{
	public static native void useRTC(boolean onOff);
	public static native void avroraBreak();
    public static native void avroraPrintShort(short value);
    public static native void avroraPrintInt(int value);
    public static native void avroraPrintHexShort(short value);
    public static native void avroraPrintHexInt(int value);
    public static native void avroraPrintSP();

	public static native void beep(int number);
	public static native void terminateOnException(short type);
}
