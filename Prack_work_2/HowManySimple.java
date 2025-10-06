package Prack_work_2;
import java.util.Scanner;

public class HowManySimple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите текст:");
        String input = scanner.nextLine().trim();

        // Проверяем, не пустая ли строка
        if (input.isEmpty()) {
            System.out.println("Вы не ввели ни одного слова!");
            return;
        }

        // Разбиваем строку на слова
        String[] words = input.split("\\s+");

        System.out.println("Вы ввели " + words.length + " слов(а):");

        // Выводим все слова с нумерацией
        for (int i = 0; i < words.length; i++) {
            System.out.println((i + 1) + ". \"" + words[i] + "\"");
        }

        scanner.close();
    }
}