package Crptage_Decyp;

import java.security.*;
import java.util.Base64;

public class KeyGenerate {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
        keyPairGenerator.initialize(512);
        KeyPair keyPair =keyPairGenerator.generateKeyPair();
        PrivateKey privateKey = keyPair.getPrivate();
        String encodedPrivateKey= Base64.getEncoder().encodeToString(privateKey.getEncoded());
        System.out.println("Private Key ");
        System.out.println(encodedPrivateKey);
        PublicKey publicKey=keyPair.getPublic();
        String encodedPublicKey = Base64.getEncoder().encodeToString(publicKey.getEncoded());
        System.out.println("Public Key");
        System.out.println(encodedPublicKey);
    }
}
