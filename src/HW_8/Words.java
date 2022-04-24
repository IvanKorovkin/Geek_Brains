package HW_8;

import java.util.Random;
import java.util.Scanner;

public class Words {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] words = {
                "apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
                "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut",
                "pear", "pepper", "pineapple", "pumpkin", "potato"
        };

        System.out.println("Ваша задача - угадать слово!");

        // генерируем случайное слово из массива
        int index = random.nextInt(words.length + 1);
        String randomWord = words[index];

        while (true) {

            String userWord = scanner.nextLine();

            if (userWord.equals(randomWord)) {
                System.out.println("Вы угадали! Загаданное слово - " + randomWord);
                break;
            }

            // проверка если длина введенного слова равна длине загаданного
            if (userWord.length() == randomWord.length()) {
                for (int i = 0; i < userWord.length(); i++) {
                    if (randomWord.charAt(i) == userWord.charAt(i)) {
                        System.out.print(randomWord.charAt(i));
                    } else {
                        System.out.print("x");
                    }
                }
                System.out.println("xxxxxxxxxxxx");
            }

            // проверка если длина введенного слова больше длины загаданного
            if (userWord.length() > randomWord.length()) {
                for (int i = 0; i < randomWord.length(); i++) {
                    if (randomWord.charAt(i) == userWord.charAt(i)) {
                        System.out.print(randomWord.charAt(i));
                    } else {
                        System.out.print("x");
                    }
                }
                System.out.println("xxxxxxxxxxxx");
            }

            // проверка если длина введенного слова меньше длины загаданного
            if (userWord.length() < randomWord.length()) {
                for (int i = 0; i < userWord.length(); i++) {
                    if (randomWord.charAt(i) == userWord.charAt(i)) {
                        System.out.print(randomWord.charAt(i));
                    } else {
                        System.out.print("x");
                    }
                }
                System.out.println("xxxxxxxxxxxx");
            }

        }

    }

}
