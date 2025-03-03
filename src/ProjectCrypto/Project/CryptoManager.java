package ProjectCrypto.Project;

public class CryptoManager {
    // Định nghĩa phạm vi ASCII hợp lệ
    private static final int LOWER_RANGE = 32;  // ASCII cho ký tự space
    private static final int UPPER_RANGE = 95;  // ASCII cho ký tự '_'
    private static final int RANGE = UPPER_RANGE - LOWER_RANGE + 1;

    // Phương thức kiểm tra xem chuỗi có nằm trong phạm vi ASCII hợp lệ không
    public static boolean isStringInBounds(String plainText) {
        for (int i = 0; i < plainText.length(); i++) {
            char c = plainText.charAt(i);
            if (c < LOWER_RANGE || c > UPPER_RANGE) return false;
        }
        return true;
    }

    // Mã hóa Caesar Cipher
    public static String caesarEncryption(String plainText, int key) {
        if (!isStringInBounds(plainText)) {
            return "The selected string is not in bounds, Try again.";
        }

        StringBuilder encryptedText = new StringBuilder();
        for (char c : plainText.toCharArray()) {
            // Dịch chuyển ký tự theo key
            int shifted = c + key;

            // Kiểm tra nếu shifted vượt qua phạm vi
            if (shifted > UPPER_RANGE) {
                shifted -= RANGE;  // Quay vòng nếu vượt qua UPPER_RANGE
            } else if (shifted < LOWER_RANGE) {
                shifted += RANGE;  // Quay vòng nếu nhỏ hơn LOWER_RANGE
            }

            // Thêm ký tự đã dịch chuyển vào kết quả
            encryptedText.append((char) shifted);
        }
        return encryptedText.toString();
    }

    // Giải mã Caesar Cipher
    public static String caesarDecryption(String encryptedText, int key) {
        StringBuilder decryptedText = new StringBuilder();
        for (char c : encryptedText.toCharArray()) {
            // Giải mã bằng cách dịch chuyển ngược lại theo key
            int shifted = c - key;  // Dịch chuyển ngược lại bằng cách trừ key
            // Kiểm tra nếu shifted vượt qua phạm vi
            if (shifted > UPPER_RANGE) {
                shifted -= RANGE;  // Quay vòng nếu vượt qua UPPER_RANGE
            } else if (shifted < LOWER_RANGE) {
                shifted += RANGE;  // Quay vòng nếu nhỏ hơn LOWER_RANGE
            }
            decryptedText.append((char) shifted);
        }
        return decryptedText.toString();
    }

    // Mã hóa Bellaso Cipher
    public static String bellasoEncryption(String plainText, String bellasoStr) {
        StringBuilder encryptedText = new StringBuilder();

        // Mở rộng từ khóa sao cho chiều dài của encryptedText bằng plainText
        for (int i = 0; i < plainText.length(); i++) {
            char c = plainText.charAt(i);

            // Lấy ký tự từ bellasoStr tại vị trí i % bellasoStr.length()
            char keyChar = bellasoStr.charAt(i % bellasoStr.length());

            // Dịch chuyển ký tự theo giá trị của từ khóa
            int shifted = c + keyChar;

            // Quay vòng trong phạm vi từ LOWER_RANGE đến UPPER_RANGE
            // Tính toán lại để đưa shifted vào phạm vi từ 32 đến 95

//            // Quay vòng trong phạm vi từ LOWER_RANGE đến UPPER_RANGE
            while (shifted > UPPER_RANGE) {
                shifted -= RANGE;  // Quay vòng nếu vượt qua UPPER_RANGE
            }

            // Nếu shifted < LOWER_RANGE, tiếp tục cộng RANGE cho đến khi nằm trong phạm vi hợp lệ
            while (shifted < LOWER_RANGE) {
                shifted += RANGE;  // Quay vòng nếu nhỏ hơn LOWER_RANGE
            }


            // Thêm ký tự đã mã hóa vào chuỗi kết quả
            encryptedText.append((char) shifted);
        }

        return encryptedText.toString();  // Trả về chuỗi mã hóa
    }

    public static String bellasoDecryption(String encryptedText, String bellasoStr) {
        StringBuilder decryptedText = new StringBuilder();

        // Mở rộng từ khóa sao cho chiều dài của bellasoStr bằng encryptedText
        for (int i = 0; i < encryptedText.length(); i++) {
            char c = encryptedText.charAt(i);

            // Lấy ký tự từ bellasoStr tại vị trí i % bellasoStr.length()
            char keyChar = bellasoStr.charAt(i % bellasoStr.length());

            // Dịch chuyển ngược lại (trừ giá trị shift của từ khóa)
            int shifted = c - keyChar;

            // Kiểm tra nếu shifted vượt qua phạm vi ASCII hợp lệ
            while (shifted > UPPER_RANGE) {
                shifted -= RANGE;  // Quay vòng nếu vượt qua UPPER_RANGE
            }

            // Nếu shifted < LOWER_RANGE, tiếp tục cộng RANGE cho đến khi nằm trong phạm vi hợp lệ
            while (shifted < LOWER_RANGE) {
                shifted += RANGE;  // Quay vòng nếu nhỏ hơn LOWER_RANGE
            }

            decryptedText.append((char) shifted);
        }

        return decryptedText.toString();  // Trả về chuỗi giải mã
    }


}
