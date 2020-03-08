package ru.geekbrains_Java_one_lesson_1_HW;

public class HW_1_1 {
    public static void main(String[] args) {
        //Задание 1: выч.выражение а*(b+(c/d))...
        int a = 5, b = 6, c = 20, d = 2;
        float result = a * (b + (c / d));
        System.out.println("а*(b+(c/d)) = " + result);
    }
}
