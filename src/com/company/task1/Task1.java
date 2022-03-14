package com.company.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Task1 {

    public static void main(String[] args) {

        System.out.println(divisionOnNumbersOfArray());
    }

    /**
     * Задание 1
     * Создать метод, который выводит в консоль результат целочисленного деления числа,
     * введенного с клавиатуры, на
     * значения элементов одномерного массива целых чисел, заполненный случайным
     * образом – от -10 до 10. Длина массива случайная – от 1 до 10.
     * Обработать все возможные исключительные ситуации в
     * данном методе
     */

    public static String divisionOnNumbersOfArray() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number !");
        int enteredNumber = 0;
        try {
            enteredNumber = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            System.out.println("Incorrect input. ");
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        StringBuilder result = new StringBuilder();
        int[] arr = new int[getRandomNumber(1, 10)];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = getRandomNumber(-10, 10);
            try {
                result.append((enteredNumber / arr[i]) + "\n");
            } catch (ArithmeticException a) {
                System.out.println("Cannot be divided by 0 .");
            }finally {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return result.toString();
    }


    public static int getRandomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt((max - min) + min);
    }


}
