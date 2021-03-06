package javax.rtcbench;
import javax.rtc.RTC;

public class CorePortMe {
	public static boolean PROFILE_RUN;
	public static boolean PERFORMANCE_RUN;
	public static boolean VALIDATION_RUN;
	public static final int ITERATIONS                      = 50;

	static {
		if (!PROFILE_RUN && !PERFORMANCE_RUN && !VALIDATION_RUN) {
			if (CoreMarkH.TOTAL_DATA_SIZE==1200) {
				PROFILE_RUN=true;
			} else if (CoreMarkH.TOTAL_DATA_SIZE==2000) {
				PERFORMANCE_RUN=true;
			} else {
				VALIDATION_RUN=true;
			}
		}

		if (VALIDATION_RUN) {
			CoreUtil.seed1_volatile=0x3415;
			CoreUtil.seed2_volatile=0x3415;
			CoreUtil.seed3_volatile=0x66;
		}
		if (PERFORMANCE_RUN) {
			CoreUtil.seed1_volatile=0x0;
			CoreUtil.seed2_volatile=0x0;
			CoreUtil.seed3_volatile=0x66;
		}
		if (PROFILE_RUN) {
			CoreUtil.seed1_volatile=0x8;
			CoreUtil.seed2_volatile=0x8;
			CoreUtil.seed3_volatile=0x8;
		}
		CoreUtil.seed4_volatile=ITERATIONS;
		CoreUtil.seed5_volatile=0;		
	}

	// public static final int CLOCKS_PER_SEC					= 1000;
	// public static final int NSECS_PER_SEC					= CLOCKS_PER_SEC;
	// public static final int TIMER_RES_DIVIDER				= 1;
	public static final int EE_TICKS_PER_SEC				= 1000;

	public static int default_num_contexts					= 1;

	// NR 20170320: These have been moved to RTC.java in base so the benchmark doesn't contain any native code.
	//              This makes it easier to run the same code in macOS by providing an alternative implementation
	//              for RTC.java.
	/* Function : start_time
		This function will be called right before starting the timed portion of the benchmark.

		Implementation may be capturing a system timer (as implemented in the example code) 
		or zeroing some system parameters - e.g. setting the cpu clocks cycles to 0.
	*/
	// public static native void start_time();

	/* Function : stop_time
		This function will be called right after ending the timed portion of the benchmark.

		Implementation may be capturing a system timer (as implemented in the example code) 
		or other system parameters - e.g. reading the current value of cpu cycles counter.
	*/
	// public static native void stop_time();

	/* Function : get_time
		Return an abstract "ticks" number that signifies time on the system.
		
		Actual value returned may be cpu cycles, milliseconds or any other value,
		as long as it can be converted to seconds by <time_in_secs>.
		This methodology is taken to accomodate any hardware or simulated platform.
		The sample implementation returns millisecs by default, 
		and the resolution is controlled by <TIMER_RES_DIVIDER>
	*/
	// public static native int get_time();


	/* Function : time_in_secs
		Convert the value returned by get_time to seconds.

		The <secs_ret> type is used to accomodate systems with no support for floating point.
		Default implementation implemented by the EE_TICKS_PER_SEC macro above.
	*/
	public static int time_in_secs(int ticks) {
		// int retval = ticks / EE_TICKS_PER_SEC;
		int retval = ticks / 1000;
		return retval;
	}
	public static int time_in_msecs(int ticks) {
		return ticks;
	}
}


/* 
	File : core_portme.c
*/
/*
	Author : Shay Gal-On, EEMBC
	Legal : TODO!
*/ 
// #include <stdio.h>
// #include <stdlib.h>
// #include "coremark.h"

// #if VALIDATION_RUN
// 	volatile ee_s32 seed1_volatile=0x3415;
// 	volatile ee_s32 seed2_volatile=0x3415;
// 	volatile ee_s32 seed3_volatile=0x66;
// #endif
// #if PERFORMANCE_RUN
// 	volatile ee_s32 seed1_volatile=0x0;
// 	volatile ee_s32 seed2_volatile=0x0;
// 	volatile ee_s32 seed3_volatile=0x66;
// #endif
// #if PROFILE_RUN
// 	volatile ee_s32 seed1_volatile=0x8;
// 	volatile ee_s32 seed2_volatile=0x8;
// 	volatile ee_s32 seed3_volatile=0x8;
// #endif
// 	volatile ee_s32 seed4_volatile=ITERATIONS;
// 	volatile ee_s32 seed5_volatile=0;
/* Porting : Timing functions
	How to capture time and convert to seconds must be ported to whatever is supported by the platform.
	e.g. Read value from on board RTC, read value from cpu clock cycles performance counter etc. 
	Sample implementation for standard time.h and windows.h definitions included.
*/
/* Define : TIMER_RES_DIVIDER
	Divider to trade off timer resolution and total time that can be measured.

	Use lower values to increase resolution, but make sure that overflow does not occur.
	If there are issues with the return value overflowing, increase this value.
	*/

// dj_time_t clock() { return dj_timer_getTimeMillis(); }

// /** Define Host specific (POSIX), or target specific global time variables. */
// static CORETIMETYPE start_time_val, stop_time_val;



// ee_u32 default_num_contexts=1;

// /* Function : portable_init
// 	Target specific initialization code 
// 	Test for some common mistakes.
// */
// void portable_init(core_portable *p, int *argc, char *argv[])
// {
// 	if (sizeof(ee_ptr_int) != sizeof(ee_u8 *)) {
// 		ee_printf("ERROR! Please define ee_ptr_int to a type that holds a pointer!\n");
// 	}
// 	if (sizeof(ee_u32) != 4) {
// 		ee_printf("ERROR! Please define ee_u32 to a 32b unsigned type!\n");
// 	}
// 	p->portable_id=1;
// }
// /* Function : portable_fini
// 	Target specific final code 
// */
// void portable_fini(core_portable *p)
// {
// 	p->portable_id=0;
// }


