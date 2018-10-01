package week1.homework;
/*Пользователь вводит три числа с консоли, нужно вывести на консоль наибольшее, наименьшее*/

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();
        if (number1 > number2 && number1 > number3) {
            System.out.println("Number 1 is highest");
        } else if (number2 > number1 && number2 > number3) {
            System.out.println("Number 2 is highest");
        } else if (number3 > number1 && number3 > number2) {
            System.out.println("Number 3 is highest");
        }
        if (number1 < number2 && number1 < number3) {
            System.out.println("Less number is 1");
        } else if (number2 < number1 && number2 < number3) {
            System.out.println("Less number is 2");
        } else if (number3 < number1 && number3 < number2) {
            System.out.println("Less number is 3");
        }


    }

}


