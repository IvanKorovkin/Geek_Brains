package homework;

import java.util.Random;
import java.util.Scanner;

public class HW_4 {

    // параметры для создания карты
    public static char[][] map;
    public static final int SIZE = 3;
    public static final int DOTS_TO_WIN = 3;

    // параметры ячеек
    public static final char DOT_EMPTY = '•';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';

    // переменная для ввода чисел человеком
    public static Scanner sc = new Scanner(System.in);

    // переменная для хода компьютера
    public static Random rand = new Random();

    // метод для инициализации карты
    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    // метод для печати карты
    public static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // метод для хода человека
    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[y][x] = DOT_X;
    }

    // метод для проверки возможности хода в ячейку
    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
        if (map[y][x] == DOT_EMPTY) return true;
        return false;
    }

    // метод для хода компьютера
    public static void aiTurn() {
        int x, y;
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (!isCellValid(x, y));
        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_O;
    }

    // метод для проверки победы


    // метод для проверки условия победы в строках и столбцах
    public static boolean checkRowColumn(char symb) {

        for (int i = 0; i < SIZE; i++) {

            int row = 0;
            int column = 0;

            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == symb) {
                    row++;
                }
                if (map[j][i] == symb) {
                    column++;
                }

            }

            if (row == DOTS_TO_WIN || column == DOTS_TO_WIN) {
                return true;
            }
        }

        return false;

    }

    // метод для проверки условия победы в диагоналях
    public static boolean checkDiagonal(char symb) {

        int firstDiagonal = 0;
        int secondDiagonal = 0;

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (i == j && map[i][j] == symb) {
                    firstDiagonal++;
                } else if (i + j == map.length - 1 && map[i][j] == symb) {
                    secondDiagonal++;
                }
            }
            if (firstDiagonal == DOTS_TO_WIN || secondDiagonal == DOTS_TO_WIN) {
                return true;
            }
        }

        return false;
    }

    // метод для проверки заполненности всей карты
    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }


        public static void main (String[]args){

            initMap();
            printMap();

            while (true) {
                humanTurn();
                printMap();

                // проверка победы человека в строках и колонках
                if (checkRowColumn(DOT_X)) {
                    System.out.println("Победил человек!");
                    break;
                }

                // проверка победы человека по диагоналям
                else if (checkDiagonal(DOT_X)) {
                    System.out.println("Победил человек!");
                    break;
                }

                // проверка ничьи
                else if (isMapFull()) {
                    System.out.println("Ничья");
                    break;
                }

                aiTurn();
                printMap();

                // проверка победы компьютера в строках и колонках
                if (checkRowColumn(DOT_O)) {
                    System.out.println("Победил человек!");
                    break;
                }

                // проверка победы компьютера по диагоналям
                else if (checkDiagonal(DOT_O)) {
                    System.out.println("Победил человек!");
                    break;
                }

                // проверка ничьи
                else if (isMapFull()) {
                    System.out.println("Ничья");
                    break;
                }

            }
        }


    }



