package Prack_work_8;

import java.util.Scanner;

public class OddNumbers {

    // Рекурсивная функция для вывода нечетных чисел
    public static void printOddNumbers() {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        // Базовый случай: если введен 0, завершаем рекурсию
        if (num == 0) {
            return;
        }

        // Если число нечетное, выводим его
        if (num % 2 != 0) {
            System.out.println(num);
        }

        // Рекурсивный вызов для следующего числа
        printOddNumbers();

        scanner.close();
    }

    public static void main(String[] args) {
        printOddNumbers();
    }
}