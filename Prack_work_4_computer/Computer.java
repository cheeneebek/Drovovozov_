package Prack_work_4_Computer;

public class Computer {
    private ComputerBrand brand;
    private String model;
    private Processor processor;
    private Memory memory;
    private Monitor monitor;
    private double price;

    public Computer(ComputerBrand brand, String model, Processor processor,
                    Memory memory, Monitor monitor, double price) {
        this.brand = brand;
        this.model = model;
        this.processor = processor;
        this.memory = memory;
        this.monitor = monitor;
        this.price = price;
    }

    // Геттеры
    public ComputerBrand getBrand() { return brand; }
    public String getModel() { return model; }
    public Processor getProcessor() { return processor; }
    public Memory getMemory() { return memory; }
    public Monitor getMonitor() { return monitor; }
    public double getPrice() { return price; }

    // Сеттеры
    public void setPrice(double price) { this.price = price; }
    public void setMemory(Memory memory) { this.memory = memory; }
    public void setMonitor(Monitor monitor) { this.monitor = monitor; }

    public String getFullSpecifications() {
        return String.format(
                "Компьютер: %s %s\n" +
                        "Цена: $%.2f\n" +
                        "%s\n" +
                        "%s\n" +
                        "%s",
                brand, model, price,
                processor.getInfo(),
                memory.getInfo(),
                monitor.getInfo()
        );
    }

    public double calculateTotalPerformance() {
        return processor.calculatePerformance() + memory.getBandwidth();
    }

    public boolean isGamingComputer() {
        return processor.getCores() >= 6 &&
                memory.getSize() >= 16 &&
                monitor.isSuitableForGaming();
    }

    public void upgradeMemory(Memory newMemory) {
        if (newMemory.isCompatibleWith(this.processor)) {
            this.memory = newMemory;
            this.price += newMemory.getSize() * 10; // увеличиваем цену
        } else {
            System.out.println("Новая память не совместима с процессором!");
        }
    }

    @Override
    public String toString() {
        return String.format("%s %s - $%.2f", brand, model, price);
    }
}