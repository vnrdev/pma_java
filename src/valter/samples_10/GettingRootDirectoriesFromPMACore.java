package valter.samples_10;

import com.pathomation.Core;
import valter.configuration.Config;

/**
 * @author Valter
*/

public class GettingRootDirectoriesFromPMACore {
    public static void main(String[] args) {
                String pmaCoreServer = Config.pmaCoreServer;
		String pmaCoreUser = Config.pmaCoreUser;
		String pmaCorePass = Config.pmaCorePass;
				
		String sessionID = Core.connect(pmaCoreServer, pmaCoreUser, pmaCorePass);
		
		if (sessionID == null) {
			System.out.println("Unable to connect to PMA.core at specified location (" + pmaCoreServer + ")");
		} else {
			System.out.println("Successfully connected to " + pmaCoreServer + "<br/>");
			System.out.println("You have the following root-directories at your disposal:" + "<br/>");
			for (String rd : Core.getRootDirectories(sessionID)) {
				System.out.println(rd);
			}
			Core.disconnect(sessionID);
		}		
    }
}
