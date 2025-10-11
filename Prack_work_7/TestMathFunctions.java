package Prack_work_7.Prack_work_7_Math;


public class TestMathFunctions {
    public static void main(String[] args) {
        // Правильно - создаем экземпляр класса, реализующего интерфейс
        MathCalculable mc1 = new MathFunc();




        MathFunc math = new MathFunc();


        System.out.println("=== Тестирование математических функций ===");


        System.out.println("2^3 = " + math.power(2, 3));
        System.out.println("5^2 = " + math.power(5, 2));
        System.out.println("4^0.5 = " + math.power(4, 0.5));

        System.out.println("|3 + 4i| = " + math.complexModulus(3, 4));
        System.out.println("|1 + 1i| = " + math.complexModulus(1, 1));
        System.out.println("|5 + 12i| = " + math.complexModulus(5, 12));

        System.out.println("Длина окружности (r=5): " + math.circleLength(5));
        System.out.println("Длина окружности (r=10): " + math.circleLength(10));

        System.out.println("Площадь круга (r=3): " + math.circleArea(3));
        System.out.println("Площадь круга (r=7): " + math.circleArea(7));

        System.out.println("Число PI из интерфейса: " + MathCalculable.PI);

        System.out.println("\n=== Демонстрация полиморфизма ===");
        MathCalculable calculator = new MathFunc();
        System.out.println("Через интерфейс: 2^4 = " + calculator.power(2, 4));
        System.out.println("Через интерфейс: |6 + 8i| = " + calculator.complexModulus(6, 8));

    }
}