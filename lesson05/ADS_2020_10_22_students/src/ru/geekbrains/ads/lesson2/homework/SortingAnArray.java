package ru.geekbrains.ads.lesson2.homework;

import java.util.Arrays;

public class SortingAnArray {

    private static int[] arr;

    public static void main(String[] args) {

        // создаем массив c случайными числами
        arr = arrayWithNumbers(10000);
        System.out.println("///////////////////////////////");
        // сортировка методом sortingBubble
        sortingBubble(arr);
        System.out.println("///////////////////////////////");
        // сортировка методом sortingByChoice
        sortingByChoice(arr);
        System.out.println("///////////////////////////////");
        // сортировка методом insertSorting
        insertSorting(arr);


    }

    // создаем массив с числами
    public static int[] arrayWithNumbers(int value){
        int[] arr = new int[value];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)((Math.random()*value));
        }
        System.out.println();
        return arr;

    }

    // Сортировка пузырьком
    public static void sortingBubble(int[] arr){
//        int[] arrNew = new int[arr.length];
//        System.arraycopy(arr, 0, arrNew, 0, arrNew.length); // копирует только ссылки на один массив. не корректно в данном случае работает
        int[] arrNew = Arrays.copyOf(arr, arr.length);
        System.out.println("Исходный массив sortingBubble: " + Arrays.toString(arrNew));
        System.out.println("Работает метод сортировки 'sortingBubble' ");
        Stopwatch timer = new Stopwatch();
        for (int i = 0; i < arrNew.length; i++) {
            for (int j = 0; j < arrNew.length-1-i ; j++) {

                if (arrNew[j] > arrNew[j+1]){
                    int temp = arrNew[j];
                    arrNew[j] =arrNew[j+1];
                    arrNew[j+1] = temp;
                }
            }
        }
        double time = timer.expendTime();
        System.out.println(Arrays.toString(arrNew));
        System.out.println("Сортировка методом sortingBubble заняла: " + time + " секунд");
    }

    public static void sortingByChoice(int[] arr){
//        int[] arrNew = new int[arr.length];
        int[] arrNew = Arrays.copyOf(arr, arr.length);
        System.out.println("Исходный массив sortingByChoice: " + Arrays.toString(arrNew));
//        System.arraycopy(arr, 0, arrNew, 0, arrNew.length); // копирует только ссылки на один массив. не корректно в данном случае работает
//        System.out.println(Arrays.toString(arrNew));
        System.out.println("Работает метод сортировки 'sortingByChoice' ");
        Stopwatch timer = new Stopwatch();

            for (int i = 0; i < arrNew.length - 1; i++) {
            int minIndex = i;
                for (int j = i + 1; j < arrNew.length; j++) {
                    if (arrNew[j] < arrNew[minIndex]) {
                        minIndex = j;
                    }

                }
                swap(arrNew, minIndex, i);

        }
        double time = timer.expendTime();
        System.out.println(Arrays.toString(arrNew));
        System.out.println("Сортировка методом sortingByChoice заняла: " + time + " секунд");

    }

    private static void swap(int[] arr, int indexA, int indexB) {
        int temp = arr[indexA];
        arr[indexA] = arr[indexB];
        arr[indexB] = temp;
}


    public static void insertSorting(int[] arr){
//        int[] arrNew = new int[arr.length];
        int[] arrNew = Arrays.copyOf(arr, arr.length);
        System.out.println("Исходный массив insertSorting: " + Arrays.toString(arrNew));
//        System.arraycopy(arr, 0, arrNew, 0, arrNew.length); // копирует только ссылки на один массив. не корректно в данном случае работает
        System.out.println("Работает метод сортировки 'insertSorting' ");
        Stopwatch timer = new Stopwatch();
        for (int i = 1; i < arrNew.length; i++) {
            int temp = arrNew[i];
            int in = i;
            while (in > 0 && arrNew[in - 1] >= temp) {
                arrNew[in] = arrNew[in - 1];
                in--;
            }
            arrNew[in] = temp;
        }
        double time = timer.expendTime();
        System.out.println(Arrays.toString(arrNew));
        System.out.println("Сортировка методом insertSorting заняла: " + time + " секунд");
    }

}
