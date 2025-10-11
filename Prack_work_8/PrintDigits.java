package Prack_work_8;

public class PrintDigits {

    // Рекурсивный метод для вывода цифр числа по порядку
    public static void printDigits(int n) {
        // Базовый случай: если число однозначное
        if (n < 10) {
            System.out.println(n);
            return;
        }

        //Шаг рекурсии: сначала выводим все цифры кроме последней, затем последнюю
        printDigits(n / 10);  // Рекурсивно обрабатываем число без последней цифры
        System.out.println(n % 10);  // Выводим последнюю цифру
    }

    public static void main(String[] args) {

        int[] testNumbers = {123432, 987};

        for (int num : testNumbers) {
            System.out.println("Цифры числа " + num + ":");
            printDigits(num);
            System.out.println();
        }
    }
}