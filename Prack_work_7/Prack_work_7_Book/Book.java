package Prack_work_7.Prack_work_7_Math.Prack_work_7_Book;

public class Book implements Printable {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public void print() {
        System.out.println("Книга: '" + title + "', автор: " + author);
    }

    // Статический метод для вывода только книг
    public static void printBooks(Printable[] printable) {
        System.out.println("Книги в массиве:");
        for (Printable item : printable) {
            if (item instanceof Book) {
                System.out.println("- " + ((Book)item).getTitle());
            }
        }
    }
}
