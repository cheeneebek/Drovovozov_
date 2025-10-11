package Prack_work_7.Prack_work_7_Math;

public class MathFunc implements MathCalculable {

    @Override
    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    @Override
    public double complexModulus(double real, double imaginary) {
        return Math.sqrt(real * real + imaginary * imaginary);
    }

    public double circleLength(double radius) {
        return 2 * PI * radius;
    }

    public double circleArea(double radius) {
        return PI * power(radius, 2);
    }

    public double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(power(x2 - x1, 2) + power(y2 - y1, 2));
    }
}
