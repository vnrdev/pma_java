package valter.samples_10;

import com.pathomation.Core;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONArray;
import valter.samples_10.util.PMAconnect;

/**
 * @author Valter
 */
public class GetFilesForSlide {

    public static void main(String[] args) {
        if (PMAconnect.connect()) {
            String slideRef = "path/to/img";            
            String sessionID = PMAconnect.getSessionID();

            try {
                Map<String, Map<String, String>> filesForSlide = Core.getFilesForSlide(slideRef, sessionID);
                
                for (Map.Entry<String, Map<String,String>> entry : filesForSlide.entrySet()) {
                    String key = entry.getKey();
                    Map<String, String> values = entry.getValue();
                    
                    System.out.println("file: " + key);
                    
                    for(Map.Entry<String, String> value : values.entrySet()) {
                        System.out.println("details: " + value);
                    }                    
                }
               
            } catch (Exception ex) {
                Logger.getLogger(IdentifyBarCodeText.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            System.out.println("Could not connect.");
        }
    }

}
