package valter.samples_10;

import com.pathomation.Core;
import java.util.logging.Level;
import java.util.logging.Logger;
import valter.samples_10.util.PMAconnect;

/**
 * @author Valter
 */
public class IsLite {

    public static void main(String[] args) {
        if (PMAconnect.connect()) {            
            String sessionID = PMAconnect.getPmaCoreServer();

            try {
                boolean isLite = Core.isLite(sessionID);
                System.out.println("isLite: " + isLite);

            } catch (Exception ex) {
                Logger.getLogger(IdentifyBarCodeText.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            System.out.println("Could not connect.");
        }
    }
}
