package Prack_work_10;

import java.util.*;
import java.util.Comparator;

public class SortingStudentsByGPA {
    private List<Student> iDNumber;

    public SortingStudentsByGPA() {
        iDNumber = new ArrayList<>();
    }

    // 1) Метод заполнения массива
    public void setArray(List<Student> students) {
        iDNumber.clear();
        iDNumber.addAll(students);
    }

    // 2) Быстрая сортировка по GPA (убывание) с Comparator
    public void quickSortByGPA() {
        quickSort(iDNumber, 0, iDNumber.size() - 1,
                Comparator.comparingDouble(Student::getGpa).reversed());
    }

    private void quickSort(List<Student> list, int low, int high, Comparator<Student> comp) {
        if (low < high) {
            int pi = partition(list, low, high, comp);
            quickSort(list, low, pi - 1, comp);
            quickSort(list, pi + 1, high, comp);
        }
    }

    private int partition(List<Student> list, int low, int high, Comparator<Student> comp) {
        Student pivot = list.get(high);
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (comp.compare(list.get(j), pivot) < 0) {
                i++;
                Collections.swap(list, i, j);
            }
        }
        Collections.swap(list, i + 1, high);
        return i + 1;
    }

    // 2) Сортировка слиянием по GPA (убывание)
    public void mergeSortByGPA() {
        iDNumber = mergeSort(iDNumber, Comparator.comparingDouble(Student::getGpa).reversed());
    }

    private List<Student> mergeSort(List<Student> list, Comparator<Student> comp) {
        if (list.size() <= 1) {
            return list;
        }

        int mid = list.size() / 2;
        List<Student> left = mergeSort(new ArrayList<>(list.subList(0, mid)), comp);
        List<Student> right = mergeSort(new ArrayList<>(list.subList(mid, list.size())), comp);

        return merge(left, right, comp);
    }

    private List<Student> merge(List<Student> left, List<Student> right, Comparator<Student> comp) {
        List<Student> result = new ArrayList<>();
        int i = 0, j = 0;

        while (i < left.size() && j < right.size()) {
            if (comp.compare(left.get(i), right.get(j)) <= 0) {
                result.add(left.get(i));
                i++;
            } else {
                result.add(right.get(j));
                j++;
            }
        }

        while (i < left.size()) {
            result.add(left.get(i));
            i++;
        }

        while (j < right.size()) {
            result.add(right.get(j));
            j++;
        }

        return result;
    }

    // 4) Сортировка по другому полю (по фамилии)
    public void sortByLastName() {
        iDNumber.sort(Comparator.comparing(Student::getLastName));
    }

    // 3) Метод для вывода массива
    public void outArray() {
        System.out.println("Список студентов:");
        System.out.println("Имя       Фамилия   Специальность    Курс Группа GPA");
        System.out.println("-----------------------------------------------------");
        for (Student student : iDNumber) {
            System.out.println(student);
        }
    }

    // Геттер для получения списка
    public List<Student> getStudents() {
        return new ArrayList<>(iDNumber);
    }
}