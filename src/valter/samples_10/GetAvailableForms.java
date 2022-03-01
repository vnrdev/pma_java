package valter.samples_10;

import com.pathomation.Core;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import valter.samples_10.util.PMAconnect;

/**
 * @author Valter
 */
public class GetAvailableForms {

    public static void main(String[] args) {
        if (PMAconnect.connect()) {
            String slideRef = "path/to/slide";            
            String sessionID = PMAconnect.getSessionID();            

            try {
                Map<String, String> availableFormsMap = Core.getAvailableForms(slideRef, sessionID);
                
                for(Map.Entry<String, String> entry : availableFormsMap.entrySet()){
                    System.out.println("form: " + entry.getKey() + " " + entry.getValue());
                }
                

            } catch (Exception ex) {
                Logger.getLogger(IdentifyBarCodeText.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            System.out.println("Could not connect.");
        }
    }
}
