package javax.rtcbench;

import javax.rtc.RTC;

public class RefSignature {
    public Point location;
    public Signature sig;

    public RefSignature() {
        this.location = new Point();
        this.sig = new Signature();
    }

    public static void signatureDiffBidirectional(ShortResults results, RefSignature refSigPtr, Signature sigPtr, ShortResults currSigDiffs)
    {
        short s = 0, r = 0, f = 0; //, p = 0;
        // short[] currSigDiffs = new short[MoteTrackParams.NBR_FREQCHANNELS]; // [NBR_TXPOWERS]; --> Passed from nearestRefSigs estLocAndSend to avoid having to create multiple instances.

        // (1) - Initialize the results
        // for (f = 0; f < MoteTrackParams.NBR_FREQCHANNELS; ++f)
        //     results[f] = 0;
        results.r0 = 0;
        results.r1 = 1;

        // (2) - Compute differences, while there are more RFSignals in
        //       either the Signature or the RefSignature
        while( (s < Signature.NBR_RFSIGNALS_IN_SIGNATURE) ||
               (r < Signature.NBR_RFSIGNALS_IN_SIGNATURE) ) {

            if (!(sigPtr.rfSignals[s].sourceID != 0 || refSigPtr.sig.rfSignals[r].sourceID != 0)) {
                break;
            }

            // case 1: there are no more rfSignals in Signature
            if ( !(s < Signature.NBR_RFSIGNALS_IN_SIGNATURE && sigPtr.rfSignals[s].sourceID != 0) ) {
                RFSignal.rfSignalDiff(currSigDiffs, refSigPtr.sig.rfSignals[r], null);
                r++;
            }
            // case 2: there are no more rfSignals in RefSignature
            else if ( !(r < Signature.NBR_RFSIGNALS_IN_SIGNATURE && refSigPtr.sig.rfSignals[r].sourceID != 0) ) {
                RFSignal.rfSignalDiff(currSigDiffs, sigPtr.rfSignals[s], null);
                s++;
            }

            // If we made it this far, then there are more rfSignals in both Signature and RefSignature
            // case 3: there is a match
            else if (sigPtr.rfSignals[s].sourceID == refSigPtr.sig.rfSignals[r].sourceID) {
                RFSignal.rfSignalDiff(currSigDiffs, sigPtr.rfSignals[s], refSigPtr.sig.rfSignals[r] );
                r++;
                s++;
            }
            // case 4: rfSignal of Signature < rfSignal of RefSignature
            else if (sigPtr.rfSignals[s].sourceID < refSigPtr.sig.rfSignals[r].sourceID) {
                RFSignal.rfSignalDiff(currSigDiffs, sigPtr.rfSignals[s], null);
                s++;
            }
            // case 5: rfSignal of Signature > rfSignal of RefSignature
            else if (sigPtr.rfSignals[s].sourceID > refSigPtr.sig.rfSignals[r].sourceID) {
                RFSignal.rfSignalDiff(currSigDiffs, refSigPtr.sig.rfSignals[r], null);
                r++;
            }
            else {
                RTC.avroraPrintHex32(0xBEEF0002);
                RTC.avroraBreak();
            }

            // Add the differences from this iteration
            // for (f = 0; f < MoteTrackParams.NBR_FREQCHANNELS; ++f)
            //     results[f] += currSigDiffs[f];
            results.r0 += currSigDiffs.r0;
            results.r1 += currSigDiffs.r1;
        }
    }

    /**
     * Implements the <b>UNIDIRECTIONAL</b> signature difference algorithm. <br>
     * @param results[]  place the results for each txPower in this array
     * @param refSigPtr  the reference signature to compare
     * @param sigPtr  the signature to compare
     */
    public static void signatureDiffUnidirectional(ShortResults results, RefSignature refSigPtr, Signature sigPtr) {
        // Not implemented
    }
}
