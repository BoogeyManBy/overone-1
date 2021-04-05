package lesson1.extra;

import java.util.Scanner;

public class Function {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите да или нет");
        String answer = sc.nextLine();

        check(answer);


    }

    public static void check(String answer) {
        if (answer.equals("da")) {
            da();
        } else {
            net();
        }
    }

    private static void da() {
        System.out.println("DA");
    }

    private static void net() {
        System.out.println("NET");
    }
}
