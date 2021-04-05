package lesson1.extra;

import java.util.Scanner;

public class MyScannerChoice {
    public static void main(String[] args) {
        String myName;
        int myAge;
        boolean check = true;
        while (check) {
            Scanner sc = new Scanner(System.in);
            System.out.println("ЕСТЬ 2 ВАРИАНТА: \n1. Ввести имя\n2. Ввести возраст");
            int otvet = sc.nextInt();
            if (otvet == 1) {
                Scanner sc1 = new Scanner(System.in);
                System.out.println("Введите имя");
                myName = sc1.nextLine();
                System.out.println("Вы ввели имя: " + myName);
                check = false;
            } else if (otvet == 2) {
                Scanner sc2 = new Scanner(System.in);
                System.out.println("Введите возраст");
                myAge = sc2.nextInt();
                System.out.println("Вы ввели возраст: " + myAge);
                check = false;
            }
        }
    }
}
