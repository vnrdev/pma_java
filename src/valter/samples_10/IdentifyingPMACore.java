package valter.samples_10;

import com.pathomation.Core;
import valter.configuration.Config;

/**
 * @author Valter
*/

public class IdentifyingPMACore {
    public static void main(String[] args) {
        String pmaCoreServer = Config.pmaCoreServer;
        String pmaStart = Config.pmaStart;
    
    // testing actual "full" PMA.core instance that may or may not be out there
                String running = ((Core.isLite(pmaCoreServer) != null && Core.isLite(pmaCoreServer) == true)) ? "Yes!" : "no :-(";
		String pmaCoreWelcomeLite = "Are you running PMA.start(PMA.core.lite) at " + pmaCoreServer + " ? " + running;
                 
                System.out.println(pmaCoreWelcomeLite);
                                                               
                String runningStart = ((Core.isLite(pmaStart) != null && (Core.isLite(pmaStart) == true))  ? "Yes!" : "no :-(");
                String pmaCore = "Are you running PMA.start(PMA.core.lite) at " + pmaStart + "? " + runningStart;

                System.out.println(pmaCore);
    }
                           

}
