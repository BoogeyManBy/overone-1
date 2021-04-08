package lesson3.cats;

import java.util.Random;

public class Cat {
    private static Random random = new Random();
    String name;
    boolean isAlive;

    Cat(String name, boolean isAlive) {
        this.name = name;
        this.isAlive = isAlive;
        if (!this.isAlive) {
            this.name = "dead";
        }
    }

    Cat(String name) {
        this.name = name;

        luckyOrNot(this);

    }

    private void luckyOrNot(Cat cat) {

        if (random.nextInt(10) > 5) {

            cat.isAlive = true;
            System.out.println("It's alive!!!!!");

        } else {

            cat.isAlive = false;
            System.out.println("Unfortunately, your cat has been killed :c");
        }
    }
}
