package homework;

import java.util.Arrays;

public class HW_3 {

    // метод для 5-го задания
    public static int[] getArray(int len, int initialValue) {

        int[] array5 = new int[len];
        for (int i = 0; i < array5.length; i++) {
            array5[i] = initialValue;
        }

        return array5;
    }

    // метод для 7-го задания
    public static boolean chekSumArraysNumber(int[] array) {

        int sumAll = 0;
        int sumLeftPart = 0;

        // ищем сумму всех элементов массива
        for (int i = 0; i < array.length; i++) {
            sumAll = sumAll + array[i];
        }

        // перебираем элементы с левой стороны, считаем их сумму и сравниваем с суммой элементов с правой стороны
        for (int i = 0; i < array.length; i++) {
            sumLeftPart = sumLeftPart + array[i];
            if (sumLeftPart == sumAll - sumLeftPart) {
                break;
            }
        }

        return (sumLeftPart == sumAll - sumLeftPart);
    }

    public static void main(String[] args) {

        /** Задание №1
         * 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
         * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
         */
        System.out.println("Задание №1");

        int[] array1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == 1) {
                array1[i] = 0;
            } else {
                array1[i] = 1;
            }
        }
        System.out.println(Arrays.toString(array1));

        /** Задание №2
         * Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его
         * значениями 1 2 3 4 5 6 7 8 … 100;
         */
        System.out.println("Задание №2");

        int[] array2 = new int[100];

        for (int i = 0; i < array2.length; i++) {
            array2[i] = i + 1;
        }
        System.out.println(Arrays.toString(array2));

        /** Задание №3
         * Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
         */
        System.out.println("Задание №3");

        int[] array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < array3.length; i++) {
            if (array3[i] < 6) {
                array3[i] = array3[i] * 2;
            }
        }
        System.out.println(Arrays.toString(array3));

        /** Задание №4
         * Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью
         * цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
         * Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны,
         * то есть [0][0], [1][1], [2][2], …, [n][n]
         */
        System.out.println("Задание №4");

        int[][] array4 = new int[10][10];

        for (int i = 0; i < array4.length; i++) {
            for (int j = 0; j < array4[i].length; j++) {
                if (i == j) {
                    array4[i][j] = 1;
                } else if (i + j == array4.length - 1) {
                    array4[i][j] = 1;
                }
                System.out.println(array4[i][j]);
            }
            System.out.println();
        }
        // нагуглил такой способ распечатать массив в виде таблицы
 		Arrays.stream(array4).map(Arrays::toString).forEach(System.out::println);

        /** Задание №5
         * Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив
         * типа int длиной len, каждая ячейка которого равна initialValue;
         */
        System.out.println("Задание №5");
        System.out.println(Arrays.toString(getArray(10, 5)));

        /** Задание №6
         * Задать одномерный массив и найти в нем минимальный и максимальный элементы ;
         */
        System.out.println("Задание №6");

        int[] array6 = {54, 49, 651, 0, -4, -58, 55, 78, 4, 87};

        // вводим переменные, с которыми будем сравнивать первый элемент массива
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < array6.length; i++) {
            if (array6[i] < min) {
                min = array6[i];
            }
            if (array6[i] > max) {
                max = array6[i];
            }
        }
        System.out.println(min);
        System.out.println(max);

        /** Задание №7
         * Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true,
         * если в массиве есть место, в котором сумма левой и правой части массива равны.
         */
        System.out.println("Задание №7");
        int[] array7 = {2, 2, 2, 1, 2, 2, 10, 1};
        System.out.println((chekSumArraysNumber(array7)));

    }

}
