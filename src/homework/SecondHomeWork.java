package homework;

public class SecondHomeWork {

    public static void main(String[] args) {

        addNumber(10, 20);
        getRange(-5);
        getRangeBoolean(-0);
        printString("Hello", 5);
        getYear(2012);


    }

    public static boolean addNumber(int a, int b) {
        int sum = a + b;
        boolean bool;
        if (sum > 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void getRange(int a) {
        if (a >= 0) {
            System.out.println("Число положительное!");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean getRangeBoolean(int a) {
        if (a < 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void printString(String str, int a) {
        for (int i = 0; i < a; i++) {
            System.out.println(str);
        }
    }

    public static boolean getYear(int a) {

        if ((a % 100 == 0) && (a % 400 != 0)) {
            System.out.println("false");
            return false;
        } else if ((a % 4 == 0) || (a % 400 == 0)) {
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }


    }


}
