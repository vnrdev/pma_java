package valter.samples_10;

import com.pathomation.Core;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import valter.samples_10.util.PMAconnect;
        
/**
 * @author Valter
*/

public class IdentifyBarCodeText {
    public static void main(String[] args) {                
        if(PMAconnect.connect()) {
            try {                
                String slideRef = "path/to/img";
                String sessionID = PMAconnect.getSessionID();
                
                String barcodeText = Core.getBarcodeText(slideRef, sessionID);
                System.out.println("barcode text: " + barcodeText);
                
            } catch (Exception ex) {
                Logger.getLogger(IdentifyBarCodeText.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            System.out.println("Could not connect.");
        }
    }

}
