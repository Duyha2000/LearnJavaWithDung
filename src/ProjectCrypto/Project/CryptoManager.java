package ProjectCrypto.Project;

public class CryptoManager {
    // ASCII 32 to ASCII 95
    // LOWER_RANGE and UPPER_RANGE  RANGE:
    public static final int LOWER_RANGE = 32;
    public static final int UPPER_RANGE = 95;

    public static final int RANGE = (UPPER_RANGE - LOWER_RANGE) + 1; // 64

    // The parameter plainText is the string to be encrypted.
    // The method returns true if all characters are within the allowable bounds, false if any character is outside. (for)
    public static boolean isStringInBounds(String plainText) {
        // plainText:
        int count = 0;
        // 'ABC'd
        for (int i = 0; i < plainText.length(); i++) {
            if (plainText.charAt(i) < LOWER_RANGE || plainText.charAt(i) > UPPER_RANGE) {
                count++;
            }
        }
        return count <= 0; // thỏa mãn dkien -> true
    }

    // plainText: ABCD
    // key = 3
    // The parameter integer key specifies an offset and each character in plainText is replaced by the character the specified distance away from it.
    //	The method returns the encrypted string.
    public static String caesarEncryption(String plainText, int key) {
        if (!isStringInBounds(plainText)) {
            System.out.println("The selected string is not in bounds, Try again");
        }
        StringBuilder newText = new StringBuilder(); // newText = ""
        // Lấy từng ký tự plainText + key -> thêm nó vào newText ( newText.append)
        for (int i = 0; i < plainText.length(); i++) {
            int shifted = plainText.charAt(i) + key; // Ký tự sau khi di chuyển (ASCII)
            // shifted -> 120 - RANGE(64) = 56
            if (shifted > UPPER_RANGE) {
                shifted -= RANGE; // 64
                // 20 + RANGE
            } else if (shifted < LOWER_RANGE) {
                shifted += RANGE;
            }
            newText.append((char) shifted);
        }
        return newText.toString();
    }

    public static String caesarDecryption(String encryptedText, int key) {
        if (!isStringInBounds(encryptedText)) {
            System.out.println("The selected string is not in bounds, Try again");
        }
        StringBuilder descryptedText = new StringBuilder();
        for (int i = 0; i < encryptedText.length(); i++) {
            int shifted = encryptedText.charAt(i) - key;
            // encrypt: 6-7-8/ key = 2
            // descrypy: 4-5-6
            // start 0 - end 10 (11-12-13)
            if (shifted > UPPER_RANGE) {
                shifted -= RANGE; // 64
                // 20 + RANGE
            } else if (shifted < LOWER_RANGE) {
                shifted += RANGE;
            }
            descryptedText.append((char) shifted);
        }
        return descryptedText.toString();

    }
}

