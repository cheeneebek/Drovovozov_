package Prack_work_2;

public class TestBall {
    public static void main(String[] args) {
        // Тестирование конструктора по умолчанию
        Ball ball1 = new Ball();
        System.out.println("Ball1 (конструктор по умолчанию): " + ball1.toString());

        // Тестирование конструктора с параметрами
        Ball ball2 = new Ball(2.5, 3.7);
        System.out.println("Ball2 (конструктор с параметрами): " + ball2.toString());

        // Тестирование геттеров
        System.out.println("Координаты Ball2 - X: " + ball2.getX() + ", Y: " + ball2.getY());

        // Тестирование сеттеров
        ball1.setX(1.0);
        ball1.setY(1.5);
        System.out.println("Ball1 после setX и setY: " + ball1.toString());

        // Тестирование setXY
        ball1.setXY(5.0, 7.5);
        System.out.println("Ball1 после setXY: " + ball1.toString());

        // Тестирование move
        System.out.println("Ball2 до move: " + ball2.toString());
        ball2.move(1.5, -0.8);
        System.out.println("Ball2 после move(1.5, -0.8): " + ball2.toString());

        // Дополнительное тестирование move
        ball2.move(-2.0, 1.2);
        System.out.println("Ball2 после move(-2.0, 1.2): " + ball2.toString());

        // Демонстрация последовательных перемещений
        Ball ball3 = new Ball(0, 0);
        System.out.println("\nДемонстрация перемещений Ball3:");
        System.out.println("Начальная позиция: " + ball3.toString());

        ball3.move(3, 4);
        System.out.println("После move(3, 4): " + ball3.toString());

        ball3.move(-1, 2);
        System.out.println("После move(-1, 2): " + ball3.toString());

        ball3.move(0.5, -1.5);
        System.out.println("После move(0.5, -1.5): " + ball3.toString());
    }
}