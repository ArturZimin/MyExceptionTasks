package com.company.task4;

import java.util.Arrays;
import java.util.Random;

public class Task4 {


    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }

        System.out.println(Arrays.toString(array));
        Task4 t4 = new Task4();
        Arrays.sort(array);
        System.out.println("Sorted array " + Arrays.toString(array));
        t4.binaryFind(array, 5);

    }

    /**
     * Задание 4
     * Напишите метод бинарного поиска в одномерном массиве. В случае, если массив не отсортирован,
     * метод должен
     * бросать проверяемое исключение.
     */

    public void binaryFind(int[] arr, int searchNumber) {
        int firstInd = 0;
        int lastInd = arr.length - 1;
        for (int i = 0, j = i + 1; i < arr.length; i++, j++) {
            if (j < lastInd) {
                if (arr[i] > arr[j]) {
                    try {
                        throw new Exception();
                    } catch (Exception e) {
                        System.out.println(e + " Array not sorted .");
                        break;
                    }
                }
            }
        }

        int midle = (firstInd + lastInd) / 2;
        while (firstInd <= lastInd) {
            if (arr[midle] < searchNumber) {
                firstInd = midle + 1;
            } else if (arr[midle] == searchNumber) {
                System.out.println("Element is found at index: " + midle);
                break;
            } else {
                lastInd = midle - 1;
            }
            midle = (firstInd + lastInd) / 2;
        }
        if (firstInd > lastInd) {
            System.out.println("Element is not found!");
        }
    }


}
