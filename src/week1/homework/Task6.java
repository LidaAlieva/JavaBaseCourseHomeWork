package week1.homework;
/*Вводим два числа, вывести их суму, если она в диапазоне от 11 до 19.*/

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int first = sc.nextInt();
        System.out.println("Enter 2d number");
        int second = sc.nextInt();
        if ((first + second) > 11 && (first + second) < 19) {
            System.out.println(first + second);
        }else{
            System.out.println("False");
        }
    }
}


