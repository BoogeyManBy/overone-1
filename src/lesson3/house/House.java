package lesson3.house;

public class House {
    String address;
    Human[] humans;


    public void checkHouse() {

        System.out.println(this.address);

        //Пробег по всем людям в доме и проверка, живы они или нет
        for (int i = 0; i < humans.length; i++) {
            if (this.humans[i].isAlive) {
                System.out.println("It's ok.");
            } else {
                System.out.println("Здесь там труп!");
                break;
            }
        }
    }

}
