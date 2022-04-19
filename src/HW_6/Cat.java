package HW_6;

import HW_6.Animals;

public class Cat extends Animals {

    Cat (String name) {
        this.name = name;
    }


    public void run(int a) {

        if (a > 0 && a <= 200) {
            System.out.println(name + " пробежал " + a + " метров!");
        } else {
            System.out.println(name + " не может пробежать больше 200 метров!");
        }
    }

    public void swim(int a) {

        System.out.println("Коты и кошки не умеют плавать!");

    }

}
