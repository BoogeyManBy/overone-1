package lesson1.extra;

public class Table {
    public static void main(String[] args) {
        for (int a = 1; a <= 10; a++) {
            for (int b = 1; b <= 10; b++) {
                System.out.print(a * b + " ");
            }
            System.out.print("\n");
        }
        int a = 11;
        while (a <=20) {
            System.out.println(a);
            a++;
        }
    }
}
