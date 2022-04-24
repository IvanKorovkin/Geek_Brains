package HW_7;

public class Plate {

    private int food;

    public Plate (int food) {
        this.food = food;
    }

    public int decreaseFood(int n) {

        if (n > food) {
            System.out.println("В тарелке слишком мало еды, поищи другую!");
            return 0;
        } else {
            food -= n;
            return 1;
        }

    }

    public void addFood(int a) {
        food += a;
        System.out.println("В тарелку добавлено еды: " + a);
    }

    public void plateInfo() {
        System.out.println("В тарелке еды: " + food);
    }



}
