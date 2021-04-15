package lesson4.package3_interfaces;

public class Cat implements Pet, Animal {
    private int age;

    @Override
    public void pokuchatIzMiski() {
        System.out.println("Mew kushaet");
    }

    @Override
    public int returnAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void speak() {
        System.out.println("CAT SPEAK");
    }
}
