package Prack_work_10;

import java.util.*;

public class MainTest {
    public static void main(String[] args) {
        SortingStudentsByGPA sorter = new SortingStudentsByGPA();

        // Создаем два списка студентов
        List<Student> list1 = Arrays.asList(
                new Student("Иван", "Петров", "Информатика", 2, "ИС-21", 4.5),
                new Student("Мария", "Иванова", "Математика", 1, "МТ-11", 4.8),
                new Student("Алексей", "Сидоров", "Физика", 3, "ФЗ-31", 4.2)
        );

        List<Student> list2 = Arrays.asList(
                new Student("Ольга", "Кузнецова", "Химия", 2, "ХМ-22", 4.9),
                new Student("Дмитрий", "Смирнов", "Биология", 1, "БГ-12", 4.1),
                new Student("Елена", "Попова", "Информатика", 3, "ИС-33", 4.7)
        );

        System.out.println("=== ЗАДАНИЕ 2 ===");

        // Тестируем первый список
        System.out.println("\n1) Исходный список 1:");
        sorter.setArray(list1);
        sorter.outArray();

        System.out.println("\n2) Быстрая сортировка по GPA (убывание):");
        sorter.quickSortByGPA();
        sorter.outArray();

        System.out.println("\n3) Сортировка слиянием по GPA (убывание):");
        sorter.setArray(list1); // сбрасываем к исходному
        sorter.mergeSortByGPA();
        sorter.outArray();

        System.out.println("\n4) Сортировка по фамилии:");
        sorter.setArray(list1);
        sorter.sortByLastName();
        sorter.outArray();

        System.out.println("\n=== ЗАДАНИЕ 3 ===");

        // Объединяем и сортируем два списка
        System.out.println("\nОбъединение двух списков:");
        List<Student> mergedList = mergeAndSortLists(list1, list2);

        SortingStudentsByGPA mergedSorter = new SortingStudentsByGPA();
        mergedSorter.setArray(mergedList);
        mergedSorter.quickSortByGPA();
        mergedSorter.outArray();
    }

    // Метод для объединения и сортировки двух списков
    public static List<Student> mergeAndSortLists(List<Student> list1, List<Student> list2) {
        List<Student> merged = new ArrayList<>();
        merged.addAll(list1);
        merged.addAll(list2);
        return merged;
    }
}
