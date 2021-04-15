package lesson4.package2;

class Dog extends Pet {

    public Dog() {
        System.out.println("Dog is alive");
    }

    @Override
    public void speak() {
        System.out.println("Woof Woof! I'm a dog!");
    }

    public void dance() {
        System.out.println("Doggy dancing!");
    }
}
