package Prack_work_6;

public interface ConvertableMAIN {
    interface Convertable {
    void convert(double temp);
}

    public class ConverterToKelvin implements Convertable {
        @Override
        public void convert(double temp) {
            System.out.println(temp + " по Цельсию равно " + (temp + 273.15) + " Кельвин");
        }
    }

    class ConvertToFahrenheit implements Convertable {
        @Override
        public void convert(double temp) {
            // Исправленная формула
            System.out.println(temp + " по Цельсию равно " + (temp * 1.8 + 32) + " Фаренгейт");
        }
    }

    public class TemperatureConverter {
        public static void printTemp(double temp, Convertable mode) {
            mode.convert(temp);
        }

        public static void main(String[] args) {
            double temp = 6543;
            System.out.println("Конвертация температуры " + temp + "°C:");
            printTemp(temp, new ConvertToFahrenheit());
            printTemp(temp, new ConverterToKelvin());
        }
    }
}
