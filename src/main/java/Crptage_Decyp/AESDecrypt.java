package Crptage_Decyp;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

public class AESDecrypt {
    public static void main(String[] args) throws Exception {
        String codemsgcrypt="mVUmwgpwCHZWCV8/ihh1alRV3hoT25hPZn0HoNoosHQ=";
        byte[]decodemsgcrypt= Base64.getDecoder().decode(codemsgcrypt);
        String msgsecret = "1234567891234567";
        SecretKey secretKey = new SecretKeySpec(msgsecret.getBytes(),0,msgsecret.length(),"AES");
        Cipher cipher=Cipher.getInstance("AES");
        cipher.init(Cipher.DECRYPT_MODE,secretKey);
        byte[] decryptedMsg =cipher.doFinal(decodemsgcrypt);
        System.out.println(new String(decryptedMsg));
    }
}
