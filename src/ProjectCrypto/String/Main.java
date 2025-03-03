package ProjectCrypto.String;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      /*  // Fava FX
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string name: ");
        name = sc.nextLine();
        System.out.println(name);
        System.out.println(name.length()); // Hello -> 5

        StringBuilder str = new StringBuilder(name);
        str.insert(2, "ABC");
        System.out.println(str);
          String name;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string name: ");
        name = sc.nextLine(); // "banana"
        // name.charAt(0)
        // input 1 character:
        char c;
        c = sc.nextLine().charAt(0); // input character

        int count = 0;
        // i -> index ... name.charAt(i)
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == c) {
                count++;
            }
        }
        System.out.println(count);

        String name;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string name: ");
        name = sc.nextLine();
        char c;
        c = sc.nextLine().charAt(0);
        int count = 0; //
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == c) {
                count++;
            }
        }
        if (count > 0) {
            System.out.println("true");
        } else
            System.out.println("false");
        */
        String name1;
        String name2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string name: ");
        name1 = sc.nextLine();
        System.out.println("Enter string name: ");
        name2 = sc.nextLine();
        if (name1.equalsIgnoreCase(name2)) {
            System.out.println("TRUE");
        } else
            System.out.println("False");


    }
}
// Assignment Description
// Assignment Details