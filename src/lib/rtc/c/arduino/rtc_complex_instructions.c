#include "debug.h"
#include "types.h"
#include "panic.h"
#include "heap.h"
#include "global_id.h"
#include "execution.h"
#include "execution_instructions.h"
#include "rtc.h"

// TMPRTC
extern int16_t *intStack;
extern ref_t *refStack;

#ifdef AOT_SAFETY_CHECKS
void RTC_INVOKEVIRTUAL_OR_INTERFACE(dj_global_id globalId, rtc_safety_method_signature signature_info)
#else
void RTC_INVOKEVIRTUAL_OR_INTERFACE(dj_global_id globalId, uint8_t signature_info) // signature_info only contains the nr_ref_args when compiling without safety checks
#endif
{
    AVRORATRACE_DISABLE();
	DEBUG_LOG(DBG_RTC, "RTC_INVOKEVIRTUAL_OR_INTERFACE %d %d %d\n", localId.infusion_id, localId.entity_id, signature_info);
	DEBUG_LOG(DBG_RTC, "RTC_INVOKEVIRTUAL_OR_INTERFACE %p %p\n", intStack, refStack);

	DO_INVOKEVIRTUAL(globalId, signature_info);

#ifndef EXECUTION_DISABLEINTERPRETER_COMPLETELY
    // If we called a JVM method, run until it's done.
    rtc_run_interpreter_if_not_aot_compiled();
#endif

    AVRORATRACE_ENABLE();
}

uint32_t RTC_INVOKESPECIAL_OR_STATIC_FAST_JAVA(dj_global_id_with_flags methodImplId, dj_di_pointer methodImpl, uint16_t frame_size) {
    AVRORATRACE_DISABLE();
    DEBUG_LOG(DBG_RTC, "RTC_INVOKESPECIAL_OR_STATIC_FAST_JAVA %d %d\n", localId.infusion_id, localId.entity_id);
    DEBUG_LOG(DBG_RTC, "RTC_INVOKESPECIAL_OR_STATIC_FAST_JAVA %p %p\n", intStack, refStack);


// avroraCallMethodTimerMark(0);
    uint32_t retval = callJavaMethod(methodImplId, methodImpl, frame_size);
// avroraCallMethodTimerMark(100);

#ifndef EXECUTION_DISABLEINTERPRETER_COMPLETELY
    // If we called a JVM method, run until it's done.
    rtc_run_interpreter_if_not_aot_compiled();
#endif

    AVRORATRACE_ENABLE();

    return retval;
}

void RTC_INVOKESPECIAL_FAST_NATIVE(dj_global_id globalId, dj_di_pointer methodImpl) {
    AVRORATRACE_DISABLE();
    DEBUG_LOG(DBG_RTC, "RTC_INVOKESPECIAL %d %d\n", localId.infusion_id, localId.entity_id);
    DEBUG_LOG(DBG_RTC, "RTC_INVOKESPECIAL %p %p\n", intStack, refStack);

    callNativeMethod(globalId, methodImpl, true);

#ifndef EXECUTION_DISABLEINTERPRETER_COMPLETELY
    // If we called a JVM method, run until it's done.
    rtc_run_interpreter_if_not_aot_compiled();
#endif

    AVRORATRACE_ENABLE();
}

void RTC_INVOKESTATIC_FAST_NATIVE(dj_global_id methodImplId, dj_di_pointer methodImpl) {
    AVRORATRACE_DISABLE();
    DEBUG_LOG(DBG_RTC, "RTC_INVOKESTATIC %d %d\n", localId.infusion_id, localId.entity_id);
    DEBUG_LOG(DBG_RTC, "RTC_INVOKESTATIC %p %p\n", intStack, refStack);

    callNativeMethod(methodImplId, methodImpl, false);

#ifndef EXECUTION_DISABLEINTERPRETER_COMPLETELY
    // If we called a JVM method, run until it's done.
    rtc_run_interpreter_if_not_aot_compiled();
#endif

    AVRORATRACE_ENABLE();
}


ref_t RTC_NEW(dj_local_id localId) {
    AVRORATRACE_DISABLE();
    DEBUG_LOG(DBG_RTC, "RTC_NEW %d %d free: %d\n", localId.infusion_id, localId.entity_id, dj_mem_getFree());
    ref_t rv = DO_NEW(localId);
    AVRORATRACE_ENABLE();
    return rv;
}

ref_t RTC_LDS(dj_local_id localId) {
    AVRORATRACE_DISABLE();
    DEBUG_LOG(DBG_RTC, "RTC_LDS %d %d\n", localId.infusion_id, localId.entity_id);
    ref_t rv = DO_LDS(localId);
    AVRORATRACE_ENABLE();
    return rv;
}

ref_t RTC_ANEWARRAY(dj_local_id localId, uint16_t size) {
    AVRORATRACE_DISABLE();
    DEBUG_LOG(DBG_RTC, "RTC_NEWARRAY %d %d %d\n", localId.infusion_id, localId.entity_id, size);
    ref_t rv = DO_ANEWARRAY(localId, size);
    AVRORATRACE_ENABLE();
    return rv;
}

int16_t RTC_INSTANCEOF(dj_local_id localId, ref_t ref) {
    AVRORATRACE_DISABLE();
    DEBUG_LOG(DBG_RTC, "RTC_INSTANCEOF %d %d %d\n", localId.infusion_id, localId.entity_id, ref);
    int16_t rv = DO_INSTANCEOF(localId, ref);
    AVRORATRACE_ENABLE();
    return rv;
}

void RTC_CHECKCAST(dj_local_id localId, ref_t ref) {
    AVRORATRACE_DISABLE();
    DEBUG_LOG(DBG_RTC, "RTC_CHECKCAST %d %d %d\n", localId.infusion_id, localId.entity_id, ref);
    if (DO_INSTANCEOF(localId, ref) == 0)
        dj_panic(DJ_PANIC_CHECKCAST_FAILED);
    AVRORATRACE_ENABLE();
}
