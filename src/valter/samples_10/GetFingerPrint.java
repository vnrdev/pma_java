package valter.samples_10;

import com.pathomation.Core;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONArray;
import valter.samples_10.util.PMAconnect;

/**
 * @author Valter
 */
public class GetFingerPrint {

    public static void main(String[] args) {
        if (PMAconnect.connect()) {
            String slideRef = "path/to/img";            
            String sessionID = PMAconnect.getSessionID();

            try {
                String fingerprint = Core.getFingerPrint(slideRef, sessionID);
                System.out.println("fingerprint: " + fingerprint);

            } catch (Exception ex) {
                Logger.getLogger(IdentifyBarCodeText.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            System.out.println("Could not connect.");
        }
    }
}
