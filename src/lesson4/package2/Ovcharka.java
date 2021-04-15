package lesson4.package2;

// Нельзя наследоваться от нескольких классов!!!
//public class Ovcharka extends Dog, FourLaps {
public class Ovcharka extends Dog {
    public Ovcharka() {
        System.out.println("Ovcharka is alive");
    }

//    @Override
//    public void speak() {
//        System.out.println("I am Ovcharka");
//    }

    public void danceLikeOvcharka() {
        System.out.println("Ovchedance");
    }
}
