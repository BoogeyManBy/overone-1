package lesson4.package1;

import java.util.ArrayList;
import java.util.Collections;

class Sort {
    public static void main(String[] args) {
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        arrayList.add(5);
//        arrayList.add(2);
//        arrayList.add(10);
//        System.out.println(arrayList);
//        Collections.sort(arrayList);
//        System.out.println(arrayList);

        int[] abc = new int[] {5, 3, 2, 6, 25, 19};
        //                     2, 5, 10.....
        //                     2, 5, 10, 6 ....
        int[] sorted = sortArray(abc);
        for (int i : sorted) {
            System.out.print( i + " ");
        }
    }

    static int[] sortArray(int[] array) {
        int wc;

        for (int k = 0; k < array.length - 1; k++) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    wc = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = wc;
                }
            }
        }
        return array;
    }
}
