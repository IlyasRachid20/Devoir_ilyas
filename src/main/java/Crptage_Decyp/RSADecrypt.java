package Crptage_Decyp;

import javax.crypto.Cipher;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.Base64;

public class RSADecrypt {
    public static void main(String[] args) throws Exception {
        String encodedCryptMsg="RabE/TUW/yV9TlX3U6gPzEu/mG+C8sknDcJmxkqy96KJlf4ueA3FJP04L5gq+E5ppk07foMwgi5coHFiuZ7zVA==";
        byte[]decodeMSG = Base64.getDecoder().decode(encodedCryptMsg);
        String encodedPrivateKey="MIIBUwIBADANBgkqhkiG9w0BAQEFAASCAT0wggE5AgEAAkEA4mSiyarDgdZRhIq9KKtXvNqevWZWbxIw7uVSd/yxz1YTT/vtO8pbPi2gsng/5xHq4hMBB+AZjbCv96N8ikYTPwIDAQABAkAKQggUPi4MoILiEA1BHf5kOr2tlEj/UGIyOObTM/p0i/qNAsu0mIyDZsGvZk+STpObcEpZ+phQnJwDANOnJbpRAiEA5PulyU2M+q2UIVstDFU792KETYgF70n6wolgASJ7ZE8CIQD9GsL2KZ3LH9tluSRo1lEQ8AblTjMxyj9g2x4NtKh2EQIgQVDe22r5mc/FfzZIxUnSzyAU6SCxwK3zj2YsMmapl9UCIAbRArEoe8RtrjX2H4HnS7WeEUF5sq1DmiNco1mRJPxRAiBK05SQ5fkJNiB1E9P5n5nQ2eCQF2pKPrlpYJXgRlp/Bw==";
        byte[]decodedPrivateKey=  Base64.getDecoder().decode(encodedPrivateKey);
        KeyFactory keyFactory = KeyFactory.getInstance("RSA");
        PrivateKey privateKey = keyFactory.generatePrivate(new PKCS8EncodedKeySpec(decodedPrivateKey));
        Cipher cipher = Cipher.getInstance("RSA");
        cipher.init(Cipher.DECRYPT_MODE,privateKey);
        byte[] decryptedMSG=cipher.doFinal(decodeMSG);
        System.out.println(new String(decryptedMSG));
    }
}
