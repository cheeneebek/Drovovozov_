package Prack_work_9;

public class Sorting {

    // Сортировка вставками для любых Comparable объектов
    public static void insertionSort(Comparable[] list) {
        for (int i = 1; i < list.length; i++) {
            Comparable current = list[i];
            int j = i - 1;

            // Сдвигаем элементы, которые больше текущего
            while (j >= 0 && list[j].compareTo(current) > 0) {
                list[j + 1] = list[j];
                j--;
            }

            // Вставляем текущий элемент на правильную позицию
            list[j + 1] = current;
        }
    }
}