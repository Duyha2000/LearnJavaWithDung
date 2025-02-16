package B2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Array:
        // ArrayList - Vector

        String[] names = {"hung", "cuong", "trung", "dung"};
        int[] numbers = {1, 2, 3, 4, 5};

        // in ra cac phan tu trong array:
        // for - i
        // for- each:
        for (String name : names) {
            System.out.println(name);
        }

        for (int number : numbers) {
            System.out.println(number);
        }

        // Index: 0 - ( length - 1)
        System.out.println(names[0]);
        System.out.println(names.length);
        System.out.println(names[names.length - 1]); // "dung"

        // Cho 1 array 5 phan tu duoc nhap tu ban phim, tinh tong cac phan tu trong array:
        int n = 5;
        int[] numbers2 = new int[n]; // Khởi tạo array khi chưa biết trước các phần tử:
        Scanner scanner = new Scanner(System.in);
        // Input:
        // for (int i = 0; i < n; i++) {
        //     numbers2[i] = Integer.parseInt(scanner.nextLine());
        // }

        /* Cho 1 arrray gom 4 phan tu duoc nhap tu ban phim, tinh tong cac phan tu trong array.
        int m = 4;
        int[] numbers3 = new int[m];
        int sum = 0;
        for (int i = 0; i < m; i++) {
            numbers3[i] = Integer.parseInt(scanner.nextLine());
        }
        for (int numberEach : numbers3) {
            sum += numberEach;
        }
        System.out.println(sum);
        */

        //  Đếm số lần xuất hiện của một giá trị trong mảng
        //  arr = [1,3,5,5,3,4,5] , X = 3
        // Output: 2
        int m = 7;
        int[] arr = new int[m];
        int count = 0;
        for (int i = 0; i < m; i++) {
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        int X = 3;
        for (int iEach : arr) {
            if (iEach == 3) {
                count++;
            }
        }
        System.out.println(count);
    }
}
