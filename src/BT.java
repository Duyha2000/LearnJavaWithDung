//import java.io.File;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.util.Random;
//import java.util.Scanner;
//
//public class BT {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        Random rand = new Random();
//
//        // Mảng màu sắc để lưu trữ các màu đọc từ tệp
//        String[] colors = new String[16];
//
//        String userName, userDescription, dueDate;
//        int correctGuesses = 0;
//        boolean gameRunning = true;
//
/// /         Đọc màu sắc từ tệp và lưu vào mảng
//        try {
//            System.out.print("Enter the filename: ");
//            String filename = scanner.nextLine();
//            File file = new File(filename);
//            Scanner fileScanner = new Scanner(file);
//
//            // Đọc màu sắc từ tệp và lưu vào mảng
//            int index = 0;
//            while (fileScanner.hasNextLine() && index < colors.length) {
//                colors[index] = fileScanner.nextLine().trim();
//                index++;
//            }
//            fileScanner.close();
//        } catch (IOException e) {
//            System.out.println("Error reading the file.");
//            return;
//        }
//
//
//        while (gameRunning) {
//            System.out.println("CMSC203 Assignment1: Test your ESP skills!");
//            System.out.println("Welcome to ESP - extrasensory perception!");
//            System.out.println("Would you please choose one of the 4 options from the menu:\n");
//            System.out.println("1- read and display on the screen first " + colors.length + " names of colors from the file, so the player can select one of them.");
//            System.out.println("2- Exit from the program");
//            System.out.print("Enter the option: ");
//            int option = Integer.parseInt(scanner.nextLine());
//
//            if (option == 2) {
//                System.out.print("Enter your name: ");
//                userName = scanner.nextLine();
//                System.out.print("Describe yourself: ");
//                userDescription = scanner.nextLine();
//                System.out.print("Due Date (MM/DD): ");
//                dueDate = scanner.nextLine();
//
//                // Write results to the output file
//                try {
//                    FileWriter writer = new FileWriter("EspGameResults.txt");
//                    writer.write("Game Over\n");
//                    writer.write("You guessed " + correctGuesses + " out of 3 colors correctly.\n");
//                    writer.write("Due Date: " + dueDate + "\n");
//                    writer.write("Username: " + userName + "\n");
//                    writer.write("User Description: " + userDescription + "\n");
//                    writer.write("Date: " + dueDate + "\n");
//                    writer.close();
//                } catch (IOException e) {
//                    System.out.println("Error writing to file.");
//                }
//
//                System.out.println("Game Over");
//                System.out.println("You guessed " + correctGuesses + " out of 3 colors correctly.");
//                System.out.println("Due Date: " + dueDate);
//                System.out.println("Username: " + userName);
//                System.out.println("User Description: " + userDescription);
//                System.out.println("Date: " + dueDate);
//
//                break;
//            }
//
//            // Start the guessing game
//            correctGuesses = 0;
//            for (int round = 1; round <= 3; round++) {
//                System.out.println("\nRound " + round);
//                System.out.println("I am thinking of a color.");
//                System.out.println("Is it one of the list of colors above?");
//                System.out.print("Enter your guess: ");
//                String guess = scanner.nextLine().trim().toLowerCase();
//
//                // Randomly select a color
//                // int randomValue = rand.nextInt(10);  // Giá trị trả về sẽ từ 0 đến 9
//                int randomColorIndex = rand.nextInt(colors.length);
//                String selectedColor = colors[randomColorIndex];
//
//                if (guess.equalsIgnoreCase(selectedColor)) {
//                    System.out.println("I was thinking of " + selectedColor + ".");
//                    correctGuesses++;
//                } else {
//                    System.out.println("I was thinking of " + selectedColor + ".");
//                }
//            }
//
//            System.out.println("Game Over");
//            System.out.println("You guessed " + correctGuesses + " out of 3 colors correctly.");
//
//            System.out.print("Would you like to continue a Game? Type Yes/No: ");
//            String continueGame = scanner.nextLine();
//            if (!continueGame.equalsIgnoreCase("Yes")) {
//                gameRunning = false;
//            }
//        }
//    }
//}
