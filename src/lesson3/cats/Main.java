package lesson3.cats;

public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat("Boris", true);
        Cat cat2 = new Cat("zhivchik", false);

        Cat cat3 = new Cat("Lucky");
        Cat cat4 = new Cat("Unlucky");

        System.out.println(cat.name);
        System.out.println(cat2.name);
        System.out.println(cat3.name + " " + cat3.isAlive);
        System.out.println(cat4.name + " " + cat4.isAlive);
    }
}
