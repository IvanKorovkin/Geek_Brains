package HW_6;

public class Main {

    public static void main(String[] args) {

        Animals cat1 = new Cat("Барсик");
        Animals cat2 = new Cat("Рыжик");
        Animals dog1 = new Dog("Бобик");
        Animals dog2 = new Dog("Полкан");

        Animals[] animals = {
            cat1,
            cat2,
            dog1,
            dog2
        };

        int catCount = 0;
        int dogCount = 0;
        int animalCount = 0;

        for (int i = 0; i < animals.length; i++) {
            animals[i].run(50);
            animals[i].swim(10);

            if (animals[i] instanceof Cat) {
                catCount++;
            } else if (animals[i] instanceof Dog) {
                dogCount++;
            }

        }

        System.out.println("Всего котов - " + catCount);
        System.out.println("Всего собак - " + dogCount);
        System.out.println("Всего животных - " + (catCount + dogCount));

    }

}
