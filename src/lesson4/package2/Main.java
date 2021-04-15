package lesson4.package2;

public class Main {
    public static void main(String[] args) {
//        Ovcharka sob = new Ovcharka();
//        Ovcharka ov = new Dog();
        Dog dog = new Ovcharka();
        dog.speak();
        dog.dance();

        Ovcharka ovs = new Ovcharka();
        ovs.dance();
        ovs.everyPetCanDrink();


    }
}
