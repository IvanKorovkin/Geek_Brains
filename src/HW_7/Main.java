package HW_7;

public class Main {

    public static void main(String[] args) {

        Cat cat1 = new Cat("Барсик", 15);
        Cat cat2 = new Cat("Мурзик", 5);
        Cat cat3 = new Cat("Рыжик", 15);
        Cat cat4 = new Cat("Лохмот", 10);
        Plate plate2 = new Plate(50);
        plate2.plateInfo();

        Cat[] cats = {
            cat1,
            cat2,
            cat3,
            cat4,
        };

        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate2);
        }
        plate2.plateInfo();

        plate2.addFood(20);
        plate2.plateInfo();

    }

}
