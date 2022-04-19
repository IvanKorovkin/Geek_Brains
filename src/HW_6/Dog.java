package HW_6;

import HW_6.Animals;

public class Dog extends Animals {

    Dog (String name) {
        this.name = name;
    }


    public void run(int a) {

        if (a > 0 && a <= 500) {
            System.out.println(name + " пробежал " + a + " метров!");
        } else {
            System.out.println(name + " не может пробежать больше 500 метров!");
        }
    }

    public void swim(int a) {

        if (a > 0 && a <= 10) {
            System.out.println(name + " проплыл " + a + " метров!");
        } else {
            System.out.println(name + " не может проплыть больше 10 метров!");
        }

    }



}
