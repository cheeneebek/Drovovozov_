public class Task3 {
    public static void main(String[] args) {
        // Инициализация массива как в C
        int[] numbers = {5, 3, 8, 1, 9, 2, 7, 4, 6, 10};
        int sum = 0;

        // Вычисление суммы в цикле for
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        // Вычисление среднего арифметического
        double average = (double) sum / numbers.length;

        // Вывод результатов
        System.out.println("Массив: " + java.util.Arrays.toString(numbers));
        System.out.println("Сумма элементов: " + sum);
        System.out.println("Среднее арифметическое: " + average);
    }
}