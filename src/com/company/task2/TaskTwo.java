package com.company.task2;

import org.junit.Test;

import java.io.IOException;

public class TaskTwo {

    public static void main(String[] args) {



       TaskTwo taskTwo=new TaskTwo();
       taskTwo.checkedNumber(50);
    }

    /**
     * Задание 2
     * Создать метод, принимающий на вход число. В случае,
     * если число отрицательное, в методе должно быть брошено
     * проверяемое исключение. Если число больше 100, должно
     * быть брошено непроверяемое исключение. Создать свои исключения для данного примера.
     * Протестируйте метод с помощью JUnit-тестов.
     */

    public  void checkedNumber(int number){
        if (number<0){
            try {
                throw new IOException("The number is negative .Throw checked Exception.");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else  if(number>100){
            throw new RuntimeException("The number more 100.Throw unchecked Exception.");
        }
    }
}
