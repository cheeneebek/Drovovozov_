package Prack_work_2;
import java.util.Scanner;

public class ReverseArrayInteractive2_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Запрашиваем размер массива
        System.out.print("Введите количество элементов в массиве: ");
        int size = scanner.nextInt();
        scanner.nextLine(); // очистка буфера

        // Создаем массив
        String[] array = new String[size];

        // Заполняем массив
        System.out.println("Введите " + size + " строк:");
        for (int i = 0; i < size; i++) {
            System.out.print("Элемент " + (i + 1) + ": ");
            array[i] = scanner.nextLine();
        }

        // Выводим исходный массив
        System.out.println("\nИсходный массив:");
        printArray(array);

        // Переворачиваем массив
        reverseArray(array);

        // Выводим перевернутый массив
        System.out.println("Перевернутый массив:");
        printArray(array);

        scanner.close();
    }

    // Метод для переворачивания массива
    public static void reverseArray(String[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            String temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }

    // Метод для вывода массива
    public static void printArray(String[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("\"" + arr[i] + "\"");
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}