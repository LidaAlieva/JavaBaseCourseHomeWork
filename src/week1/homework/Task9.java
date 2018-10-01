package week1.homework;
/*Ввести с клавиатуры значения трех сторон треугольника a, b и c и определить, является ли он прямоугольным.
Ответ вывести в виде сообщения.*/

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st number");
        int number1 = sc.nextInt();
        System.out.println("Enter 2d number");
        int number2 = sc.nextInt();
        System.out.println("Enter 3d number");
        int number3 = sc.nextInt();

        int max = Math.max(Math.max(number1, number2), number3);

        if (number1 == max) {
            boolean result = Math.pow(number1, 2) == (Math.pow(number2, 2) + Math.pow(number3, 2));
            System.out.println(result);
        } else if (number2 == max) {
            boolean result = Math.pow(number2, 2) == (Math.pow(number1, 2) + Math.pow(number3, 2));
            System.out.println(result);
        } else if (number3 == max) {
            boolean result = Math.pow(number3, 2) == (Math.pow(number1, 2) + Math.pow(number1, 2));
            System.out.println(result);
        } else
            System.out.println("False");
    }
}

