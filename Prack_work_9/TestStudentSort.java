package Prack_work_9;

public class TestStudentSort {
    public static void main(String[] args) {
        // Создаем массив студентов
        Student[] students = {
                new Student(105, "Иван", 4.5),
                new Student(102, "Мария", 4.8),
                new Student(107, "Петр", 4.2),
                new Student(101, "Анна", 4.9),
                new Student(103, "Сергей", 4.1)
        };

        System.out.println("Исходный массив студентов:");
        printStudents(students);

        // Сортируем массив по ID с помощью сортировки вставками
        Sorting.insertionSort(students);

        System.out.println("\nОтсортированный массив студентов (по ID):");
        printStudents(students);
    }

    // Вспомогательный метод для вывода массива студентов
    public static void printStudents(Student[] students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}