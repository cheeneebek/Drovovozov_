public class Task6 {
    public static void main(String[] args) {
        System.out.println("Первые 10 чисел гармонического ряда:");

        for (int n = 1; n <= 10; n++) {
            double harmonicNumber = 0;
            for (int k = 1; k <= n; k++) {
                harmonicNumber += 1.0 / k;
            }
            // вывод с 4-мя знаками после запятой
            System.out.printf("H(%d) = %.4f%n", n, harmonicNumber);
        }
    }
}