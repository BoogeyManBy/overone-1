package lesson3.house;

public class Main {
    public static void main(String[] args) {

        Human boris = new Human(150, "Boris", 25, false);
        Human sergey = new Human(190, "Sergey", 27, true);

        House dom = new House();
        dom.address = "Baker street 1";

        //Создвать массив
        int[] ints = new int[] {1, 2, 3};

        Human[] humans = new Human[] {boris, sergey};

        dom.humans = humans;

        //Взять элемент массива
        System.out.println(ints[0]);

        String name = dom.humans[0].name;

        System.out.println(name);

        dom.checkHouse();

    }
    private static class Dogg {

    }
}
