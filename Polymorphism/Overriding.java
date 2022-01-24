import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

class Encryption {
    public String encryptText(String cipherText) {
        char[] charArray = cipherText.toCharArray();
        int[] encrytedText = new int[charArray.length + 1];
        for (int i = 0; i < charArray.length; i++) {
            encrytedText[i] = (int)charArray[i] + 10;
        }

        return encrytedText.toString();
    }
}

class MD5Encryption extends Encryption {

    public String encryptText(String cipherText) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");

            byte[] messageDigest = md.digest(cipherText.getBytes());

            BigInteger no = new BigInteger(1, messageDigest);

            String hashtext = no.toString(16);
            while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;
            }
            return hashtext;
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
}

class Overriding {
    public static void main(String[] args) {
        Encryption encryption = new Encryption();
        System.out.println("Encryption using simple algorithm: " + encryption.encryptText("azeem"));
        
        MD5Encryption md5Encryption = new MD5Encryption();
        System.out.println("Encryption using MD5 algorithm: " + md5Encryption.encryptText("azeem"));

        Encryption encryption2 = new MD5Encryption();
        System.out.println("Encryption using MD5 algorithm: " + encryption2.encryptText("azeem"));

    }

}
