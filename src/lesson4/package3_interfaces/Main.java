package lesson4.package3_interfaces;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setAge(10);
        Dog dog = new Dog();
        dog.setAge(15);
//
//        cat.pokuchatIzMiski();
//        dog.pokuchatIzMiski();
//
        Pet pet = dog;
//        System.out.println(pet.returnAge());
        pet.speak();
//        Pet.speak();


    }
}
