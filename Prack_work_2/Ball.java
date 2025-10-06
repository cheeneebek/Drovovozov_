package Prack_work_2;

public class Ball {
    // Поля класса с начальными значениями
    private double x = 0.0;
    private double y = 0.0;

    // Конструктор с параметрами
    public Ball(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Конструктор по умолчанию
    public Ball() {
        // x и y уже инициализированы значениями по умолчанию
    }

    // Метод getX()
    public double getX() {
        return x;
    }

    // Метод setX()
    public void setX(double x) {
        this.x = x;
    }

    // Метод getY()
    public double getY() {
        return y;
    }

    // Метод setY()
    public void setY(double y) {
        this.y = y;
    }

    // Метод setXY() - установка обеих координат
    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Метод move() - перемещение мяча
    public void move(double xDisp, double yDisp) {
        this.x += xDisp;
        this.y += yDisp;
    }

    // Метод toString()
    public String toString() {
        return "Ball[(" + x + ", " + y + ")]";
    }
}
