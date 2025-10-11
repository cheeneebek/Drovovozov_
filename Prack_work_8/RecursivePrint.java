package Prack_work_8;

public class RecursivePrint {

    // Рекурсивный метод для вывода чисел от 1 до n
    public static void printNumbers(int n) {
        // Базовый случай - когда n = 1, выводим 1 и останавливаемся
        if (n == 1) {
            System.out.print(n);
            return;
        }

        // Шаг рекурсии - сначала выводим все числа до n-1, затем n
        printNumbers(n - 1);
        System.out.print(" " + n);
    }

    // Альтернативный вариант с другим порядком вывода
    public static void printNumbersReverse(int n) {
        // Базовый случай
        if (n == 1) {
            System.out.print(n);
            return;
        }

        // Сначала выводим n, затем рекурсивно выводим остальные
        System.out.print(n + " ");
        printNumbersReverse(n - 1);
    }

    public static void main(String[] args) {
        int n = 85;

        System.out.println("Числа от 1 до " + n + ":");
        printNumbers(n);

        System.out.println("\n\nЧисла от " + n + " до 1:");
        printNumbersReverse(n);

        // Тестируем с другим значением
        System.out.println("\n\nТест с n = 3:");
        printNumbers(3);
    }
}