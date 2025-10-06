public class Task5 {
    public static void main(String[] args) {
        System.out.println("=== Задание 5 ===");
        System.out.println("Аргументы командной строки:");

        for (int i = 0; i < args.length; i++) {
            System.out.println("Аргумент " + (i + 1) + ": " + args[i]);
        }

        // Проверка если ар-ты не заданы
        if (args.length == 0) {
            System.out.println("Аргументы не переданы.");
            System.out.println("Чтобы передать аргументы, запустите программу через командную строку:");
            System.out.println("Java Task5 аргумент1 аргумент2 ...");
        }
    }
}