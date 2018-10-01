package week1.homework;
/*Ввести с клавиатуры три числа, положительные возвести в куб, а отрицательные заменить на 0*/

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st number");
        int number1 = sc.nextInt();
        System.out.println("Enter 2d number");
        int number2 = sc.nextInt();
        System.out.println("Enter 3d number");
        int number3 = sc.nextInt();

        if (number1 > 0)
            System.out.println(Math.pow(number1, 3));
        else if (number2 > 0) {
            System.out.println(Math.pow(number2, 3));
        } else if (number3 > 0) {
            System.out.println(Math.pow(number3, 3));
        } else
            System.out.println("0");
    }

}


