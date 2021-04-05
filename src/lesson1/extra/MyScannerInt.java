package lesson1.extra;

import java.util.Scanner;

public class MyScannerInt {
    public static void main(String[] args) {
        int a;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите число");
            a = sc.nextInt();
        } while (a != 10);

        System.out.println("Молодец");
    }
}
