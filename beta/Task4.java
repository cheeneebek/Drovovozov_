import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];
        int i = 0;

        System.out.println("Введите элементы массива:");
        while (i < size) {
            System.out.print("Элемент " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
            i++;
        }

        int sum = 0;
        int j = 0;
        do {
            sum += numbers[j];
            j++;
        } while (j < numbers.length);

        int min = numbers[0];
        int max = numbers[0];

        for (int k = 1; k < numbers.length; k++) {
            if (numbers[k] < min) {
                min = numbers[k];
            }
            if (numbers[k] > max) {
                max = numbers[k];
            }
        }

        // результат
        System.out.println("\nРезультаты:");
        System.out.println("Массив: " + java.util.Arrays.toString(numbers));
        System.out.println("Сумма элементов: " + sum);
        System.out.println("Минимальный элемент: " + min);
        System.out.println("Максимальный элемент: " + max);

        scanner.close();
    }
}