package lesson3.dog;

public class Main {
    public static void main(String[] args) {
        String notName = "BOB";

        Dog dog1 = new Dog(notName);
        Dog dog2 = new Dog("Hatiko");


        System.out.println(dog1.name);
        System.out.println(dog2.name);
    }
}
