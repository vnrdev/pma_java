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
        private static String sessionID;
        
        public static boolean connect() {            
            sessionID = Core.connect(pmaCoreServer, pmaCoreUser, pmaCorePass);
            if (sessionID == null) {
                System.out.println("Unable to connect to PMA.core at specified location (" + pmaCoreServer + ")");
                return false;
            }            
            return true;
        }
        
        public static String getPmaCoreServer(){
            return pmaCoreServer;
        }
        
        public static String getSessionID() {
            return sessionID;
        }
        
        public static String pmaCoreUser() {
            return pmaCoreUser;
        }
        
        public static String getPmaCorePass() {
            return pmaCorePass;
        }
}
