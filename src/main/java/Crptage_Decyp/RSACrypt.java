package Crptage_Decyp;

import javax.crypto.Cipher;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;

public class RSACrypt {
    public static void main(String[] args) throws Exception {
        KeyFactory keyFactory = KeyFactory.getInstance("RSA");
        String codpublicKey="FMJ1GCLXZuwweP3QIB9cl8RURmmDKMElUfExnaa/blVjnCEfg4FhDkAjm4vOFJyr0G/ALi660SWV8vh86N6WAA==";
        byte[]decodePK= Base64.getDecoder().decode(codpublicKey);
        PublicKey publicKey=keyFactory.generatePublic(new X509EncodedKeySpec(decodePK));
        String message = "Le message est en Clair";
        Cipher cipher =Cipher.getInstance("RSA");
        cipher.init(Cipher.ENCRYPT_MODE,publicKey);
        byte[]Messagecode=cipher.doFinal(message.getBytes());
        String encodedMSG=Base64.getEncoder().encodeToString(Messagecode);
        System.out.println(encodedMSG);



    }
}
