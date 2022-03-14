package com.company.task3;

public class Task3 {

    private int sideA;
    private int sideB;
    private int sideC;

    public Task3(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        if (sideA + sideB < sideC || sideA + sideC < sideB || sideB + sideC < sideA) {
            try {
                throw new Exception();
            } catch (Exception e) {
                System.err.println("Triangle failed !");
            }
        }
    }

    public int getSideA() {
        return sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public int getSideC() {
        return sideC;
    }


    /**
     * Задание 3
     * Создать класс, объекты которого будут неизменяемыми.
     * Класс инкапсулирует в себе информацию о треугольнике на
     * плоскости (длины каждой из его ребер). Длины сторон задаются в конструкторе.
     * Если по заданным сторонам нельзя
     * построить треугольник, в конструктор должно бросаться
     * исключение.
     * Протестируйте класс с помощью JUnit-тестов
     */
}
