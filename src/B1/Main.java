package B1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        int choice;
        Scanner inputUser = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("CMSC203 Assignment1: Test your ESP skills!");
        System.out.println("Welcome to ESP - extrasensory perception!\n");

        do {
            System.out.println("Would you like to choose one of the 4 options from the menu");
            System.out.println("1. Read and display on the screen the first 16 names of colors from a file above, so the player can select one of them.");
            System.out.println("2. Read and display on the screen the first 10 names of colors from a file above, so the player can select one of them.");
            System.out.println("3. Read and display on the screen the first 5 names of colors from a file above, so the player can select one of them.");
            System.out.println("4. Exit the program");
            System.out.print("Enter the option: ");

            choice = Integer.parseInt(inputUser.nextLine());
            // Enter the filename: colors.txt
            // Read file
            System.out.println("Enter the file name: ");
            String nameFile = inputUser.nextLine();


            switch (choice) {
                case 1: {
                    System.out.println("There are sixteen colors from a file:");
                    File f = new File(nameFile);
                    Scanner fi = new Scanner(f);

                    int startNumber = 1;
                    while (fi.hasNextLine() && startNumber <= 16) {
                        System.out.println(startNumber++ + ". " + fi.nextLine().trim());
                    }

                    // Đóng fi sau khi liệt kê 16 màu
                    fi.close();

                    int count = 0;
                    for (int i = 1; i <= 3; i++) {
                        System.out.println("Round " + i);
                        System.out.println("I am thinking of one color");
                        System.out.println("Is it one of the list of colors above?");
                        System.out.print("Enter your guess: ");
                        String guessColor = inputUser.nextLine().trim();

                        // Random 1 trong 16 dòng
                        int randomLine = rand.nextInt(16) + 1;

                        // Mở lại file bằng Scanner mới để tìm đến dòng randomLine
                        Scanner fi2 = new Scanner(new File(nameFile));

                        String secretColor = "";
                        int lineNumber = 0;
                        while (fi2.hasNextLine()) {
                            lineNumber++;
                            // *** SỬA THÀNH fi2 *** thay vì fi
                            String line = fi2.nextLine().trim();
                            if (lineNumber == randomLine) {
                                secretColor = line; // màu bí mật
                                break;
                            }
                        }
                        fi2.close();

                        // Xem màu bí mật
                        System.out.println("I was thinking of " + secretColor);

                        // So sánh
                        if (guessColor.equalsIgnoreCase(secretColor)) {
                            count++;
                        }
                    }

                    System.out.println("Game over");
                    System.out.println("You guessed " + count + " out of 3 colors correctly.");
                    break;
                }

                case 2: {
                    System.out.println("There are 10 colors from a file:");
                    break;
                }

                case 3: {
                    System.out.println("There are 5 colors from a file:");
                    break;
                }

                case 4: {
                    PrintWriter pw = new PrintWriter("EspGameResults.txt");
                    System.out.println("Enter your name: ");
                    pw.print("Enter your name: ");
                    String nameUser = inputUser.nextLine();
                    pw.println(nameUser);
                    System.out.println("Describe yourself: ");
                    pw.print("Describe yourself: ");
                    String desUser = inputUser.nextLine();
                    pw.println(desUser);
                    System.out.println("Due date: ");
                    pw.print("Due Date: ");
                    String dueDate = inputUser.nextLine();
                    pw.println(dueDate);
                    System.out.println("Username: ");
                    ;
                    pw.print("Username: ");
                    String userName = inputUser.nextLine();
                    pw.println(userName);


                    System.out.println("User Description: ");
                    pw.print("User Description: ");
                    String userDes = inputUser.nextLine();
                    pw.println(userDes);

                    System.out.println("Date: ");
                    pw.print("Date: ");
                    String dateDue = inputUser.nextLine();
                    pw.println(dateDue);
                    pw.close();
                    break;
                }
                default:
                    System.out.println("Invalid choice. Please re-enter your options.");
            }
        } while (choice != 4);


        inputUser.close();
    }
}


