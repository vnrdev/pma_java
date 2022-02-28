package valter.samples_10;

import com.pathomation.Core;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONArray;
import valter.samples_10.util.PMAconnect;

/**
 * @author Valter
 */
public class GetAnnotations {

    public static void main(String[] args) {
        if (PMAconnect.connect()) {
            String slideRef = "path/to/img";
            String sessionID = PMAconnect.getSessionID();

            try {
                JSONArray annotations = Core.getAnnotations(slideRef, sessionID);

                for (Object annotation : annotations) {
                    System.out.println("annotation: " + annotation);
                }

            } catch (Exception ex) {
                Logger.getLogger(IdentifyBarCodeText.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            System.out.println("Could not connect.");
        }
    }

}
