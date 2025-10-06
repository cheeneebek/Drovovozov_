package Prack_work_4_Computer;

public class Processor {
    private String model;
    private double frequency; // в GHz
    private int cores;
    private String socket;

    public Processor(String model, double frequency, int cores, String socket) {
        this.model = model;
        this.frequency = frequency;
        this.cores = cores;
        this.socket = socket;
    }

    // Геттеры
    public String getModel() { return model; }
    public double getFrequency() { return frequency; }
    public int getCores() { return cores; }
    public String getSocket() { return socket; }

    // Сеттеры
    public void setFrequency(double frequency) { this.frequency = frequency; }
    public void setCores(int cores) { this.cores = cores; }

    public String getInfo() {
        return String.format("Процессор: %s, %.1f GHz, %d ядер, сокет %s",
                model, frequency, cores, socket);
    }

    public double calculatePerformance() {
        return frequency * cores * 100; // условный показатель производительности
    }

    @Override
    public String toString() {
        return getInfo();
    }
}