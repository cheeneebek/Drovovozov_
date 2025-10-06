package Prack_work_2;

public class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("John Doe", "john.doe@example.com", 'M');

        System.out.println("Name: " + author.getName());
        System.out.println("Email: " + author.getEmail());
        System.out.println("Gender: " + author.getGender());

        System.out.println("Author info: " + author.toString());

        author.setEmail("new.email@example.com");
        System.out.println("Updated email: " + author.getEmail());

        System.out.println("Updated author info: " + author.toString());
    }
}
