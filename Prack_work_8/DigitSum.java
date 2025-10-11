package Prack_work_8;

public class DigitSum {

    public static int sumOfDigits(int n) {

        if (n < 10) {
            return n;
        }
        // Шаг рекурсии: последняя цифра + сумма цифр оставшегося числа
        return (n % 10) + sumOfDigits(n / 10);
    }

    public static void main(String[] args) {
        int[] testNumbers = {123, 564};

        for (int num : testNumbers) {
            int result = sumOfDigits(num);
            System.out.println("Сумма цифр числа " + num + " = " + result);
        }
    }
}
