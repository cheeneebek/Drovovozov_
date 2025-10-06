public class Task7 {

    // вычисление факториала
    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Факториал определен только для неотрицательных чисел");
        }

        long result = 1;
        // факториал в цикле
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        // Проверка работы
        System.out.println("Проверка ме-да factorial:");

        for (int i = 0; i <= 10; i++) {
            System.out.println(i + "! = " + factorial(i));
        }

        // Доп проверка
        int testNumber = 5;
        System.out.println("\nДополнительная проверка:");
        System.out.println(testNumber + "! = " + factorial(testNumber));
    }
}
