package lesson1.extra;

import java.util.Scanner;

public class MyScanner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("да или нет?");
        String answer = sc.nextLine();

        if (answer.equals("да")) {
            System.out.println("Молодец!");

        } else if (answer.equals("нет")) {

            System.out.println("Плохо!");
        } else {

            System.out.println("Напиши либо да либо нет!");
        }
    }
}
