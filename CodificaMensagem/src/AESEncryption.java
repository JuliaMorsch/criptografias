import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class AESEncryption {
    
    public static SecretKey generateAESKey() throws Exception {
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        keyGen.init(128);
        return keyGen.generateKey();
    }
    
}
