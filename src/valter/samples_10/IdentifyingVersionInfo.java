package valter.samples_10;

import com.pathomation.Core;
import valter.configuration.Config;

/**
 * @author Valter
 */
public class IdentifyingVersionInfo {

    public static void main(String[] args) {
        String pmaCoreServer = Config.pmaCoreServer;
        String pmaCoreUser = Config.pmaCoreUser;
        String pmaCorePass = Config.pmaCorePass;

        String sessionID = Core.connect(pmaCoreServer, pmaCoreUser, pmaCorePass);

        if (sessionID == null) {
            System.out.println("Unable to connect to PMA.core at specified location (" + pmaCoreServer + ")");
        } else {
            String versionAndSvnNumber = Core.getVersionInfo(pmaCoreServer);
            String versionAndSvnNumberDefault = Core.getVersionInfo("");
            System.out.println(versionAndSvnNumber);
            System.out.println("No Core URL, reverting to default: " + versionAndSvnNumberDefault);
        }
    }
    
}
