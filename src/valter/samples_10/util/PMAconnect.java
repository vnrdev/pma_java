package valter.samples_10.util;

import com.pathomation.Core;
import valter.configuration.Config;

/**
 * @author Valter
*/

public class PMAconnect {
    
        private static String pmaCoreServer = Config.pmaCoreServer;
        private static String pmaCoreUser = Config.pmaCoreUser;
        private static String pmaCorePass = Config.pmaCorePass;
        
        public static boolean connect() {            
            String sessionID = Core.connect(pmaCoreServer, pmaCoreUser, pmaCorePass);
            if (sessionID == null) {
                System.out.println("Unable to connect to PMA.core at specified location (" + pmaCoreServer + ")");
                return false;
            }            
            return true;
        }
        
        public static String getPmaCoreServer(){
            return pmaCoreServer;
        }
}
