package week1.homework;
/*Вводим 2 числа. Если первое число больше второго, то вывести на экран разницу чисел.
    Если второе больше, то выводим сумму*/

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = 20;
        int second = 5;
        int result;
        if (first > second) {
            System.out.println(first - second);
        } else if (second > first) {
            System.out.println(first + second);
        }


    }
}