package week1.homework;
/*Пользователь вводит число. Вывести на экран его удвоенное значение, если число делится на 7 нацело.*/

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        System.out.println(number / 7);
        if (number % 7 == 0)
        {
            System.out.println(number * 2);
        }


    }
}

