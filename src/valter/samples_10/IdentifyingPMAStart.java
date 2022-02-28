package valter.samples_10;

import com.pathomation.Core;

/**
 * @author Valter
*/

public class IdentifyingPMAStart {
    
    public static void main(String[] args) {        		
		// test for PMA.core.lite (PMA.start)
                String runningLite = "Are you running PMA.core.lite? " + (Core.isLite() ? "Yes!" : "no :-(");
		System.out.println(runningLite);
    }
    
		
}
