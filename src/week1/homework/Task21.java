package week1.homework;
/*Даны три числа A,B,C. Увеличить числа в два раза, если A+B+C>0, в противном случае заменить на нули.*/

import java.util.Scanner;

public class Task21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1");
        int number1 = sc.nextInt();
        System.out.println("Enter number 2");
        int number2 = sc.nextInt();
        System.out.println("Enter number 3");
        int number3 = sc.nextInt();

        if (number1 + number2 + number3 > 0) {
            System.out.println((number1 + number2 + number3) * 2);
        } else if (number1 + number2 + number3 < 0) {
            System.out.println("0 + 0 + 0");
        }
    }

}