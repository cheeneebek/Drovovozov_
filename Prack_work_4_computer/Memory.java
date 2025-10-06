package Prack_work_4_Computer;

public class Memory {
    private String type; // DDR3, DDR4, DDR5
    private int size; // в GB
    private double frequency; // в MHz
    private String manufacturer;

    public Memory(String type, int size, double frequency, String manufacturer) {
        this.type = type;
        this.size = size;
        this.frequency = frequency;
        this.manufacturer = manufacturer;
    }

    // Геттеры
    public String getType() { return type; }
    public int getSize() { return size; }
    public double getFrequency() { return frequency; }
    public String getManufacturer() { return manufacturer; }

    // Сеттеры
    public void setFrequency(double frequency) { this.frequency = frequency; }

    public String getInfo() {
        return String.format("Память: %s %dGB %.0f MHz (%s)",
                type, size, frequency, manufacturer);
    }

    public double getBandwidth() {
        // Расчет пропускной способности
        return frequency * 8; // упрощенная формула
    }

    public boolean isCompatibleWith(Processor processor) {
        // Проверка совместимости с процессором
        return !processor.getSocket().contains("OLD"); // упрощенная проверка
    }

    @Override
    public String toString() {
        return getInfo();
    }
}
