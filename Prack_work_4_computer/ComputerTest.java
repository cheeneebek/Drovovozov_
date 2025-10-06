package Prack_work_4_Computer;

public class ComputerTest {
    public static void main(String[] args) {
        // Создаем компоненты
        Processor processor = new Processor("Intel Core i7-12700K", 3.6, 12, "LGA1700");
        Memory memory = new Memory("DDR4", 16, 3200, "Kingston");
        Monitor monitor = new Monitor("Dell S2721DGF", 27.0, "2560x1440", 165, "IPS");

        // Создаем компьютер
        Computer computer = new Computer(ComputerBrand.DELL, "XPS 8950",
                processor, memory, monitor, 1500.0);

        // Выводим информацию
        System.out.println("=== ИНФОРМАЦИЯ О КОМПЬЮТЕРЕ ===");
        System.out.println(computer.getFullSpecifications());
        System.out.println("\n=== ДОПОЛНИТЕЛЬНАЯ ИНФОРМАЦИЯ ===");
        System.out.printf("Производительность: %.2f%n", computer.calculateTotalPerformance());
        System.out.println("Игровой компьютер: " + (computer.isGamingComputer() ? "Да" : "Нет"));
        System.out.printf("PPI монитора: %.1f%n", monitor.calculatePpi());

        // Апгрейд памяти
        System.out.println("\n=== АПГРЕЙД ПАМЯТИ ===");
        Memory newMemory = new Memory("DDR4", 32, 3600, "Corsair");
        computer.upgradeMemory(newMemory);
        System.out.println("После апгрейда:");
        System.out.println(computer.getFullSpecifications());
    }
}