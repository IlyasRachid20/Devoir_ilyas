package Crptage_Decyp;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

public class AESCrypt {
    public static void main(String[] args) throws Exception {
        String message="Message en Clair";
        String msgsecret = "1234567891234567";
        SecretKey secretKey = new SecretKeySpec(msgsecret.getBytes(),0,msgsecret.length(),"AES");
        byte[] codkey=secretKey.getEncoded();
        System.out.println(Base64.getEncoder().encodeToString(codkey));
        Cipher cipher =Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE,secretKey);
        byte[] encryptMsg=cipher.doFinal(message.getBytes());
        String encodeEncryptMsg= Base64.getEncoder().encodeToString(encryptMsg);
        System.out.println(encodeEncryptMsg);


    }
}
