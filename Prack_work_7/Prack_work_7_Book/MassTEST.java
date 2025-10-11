package Prack_work_7.Prack_work_7_Math.Prack_work_7_Book;

public class MassTEST {
    public static void main(String[] args) {
        // Создаем массив с книгами и другими Printable объектами
        Printable[] items = {
                new Book("Война и мир", "Толстой"),
                new Printable() {
                    @Override
                    public void print() {
                        System.out.println("Журнал");
                    }
                },
                new Book("Преступление и наказание", "Достоевский"),
                new Printable() {
                    @Override
                    public void print() {
                        System.out.println("Газета");
                    }
                }
        };

        // Вызываем статический метод для вывода только книг
        Book.printBooks(items);
    }
}
