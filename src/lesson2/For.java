package lesson2;

public class For {
    public static void main(String[] args) {

        for (int i = 1; i <= 10 ; i++ ) {
            System.out.println(i);
        }

        int i = 1;

        while(i <= 10) {
            System.out.println(i);
            i += 2;
        }

        int b = 1;
        do {
            System.out.println(b);
            b++;
        } while (b <= 10);

        int[] massiv = new int[] {10, 20, 30};
        System.out.println(massiv[0]);

        int r = 10;
        String[] massivString;


        for (int k : massiv) {
            System.out.println(k);
            r += k;
            k++;

        }



    }
}
