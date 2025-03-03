package ProjectCrypto.Project;

public class Main {
    public static void main(String[] args) {
        String plainText = "HOW MUCH WOOD CAN A WOODCHUCK CHUCK IF A WOOD CHUCK COULD CHUCK";
        String bellasoStr = "HELLO";
        int caesarKey = 15;

        // Kiểm tra mã hóa và giải mã Caesar Cipher
        System.out.println("Caesar Cipher Test:");
        String encryptedCaesar = CryptoManager.caesarEncryption(plainText, caesarKey);
        System.out.println("Encrypted Caesar: " + encryptedCaesar);

        String decryptedCaesar = CryptoManager.caesarDecryption(encryptedCaesar, caesarKey);
        System.out.println("Decrypted Caesar: " + decryptedCaesar);

        // Kiểm tra mã hóa và giải mã Bellaso Cipher
        // System.out.println("\nBellaso Cipher Test:");
        //String encryptedBellaso = CryptoManager.bellasoEncryption(plainText, bellasoStr);
        // System.out.println("Encrypted Bellaso: " + encryptedBellaso);

        // String decryptedBellaso = CryptoManager.bellasoDecryption(encryptedBellaso, bellasoStr);
        // System.out.println("Decrypted Bellaso: " + decryptedBellaso);

    }
}

