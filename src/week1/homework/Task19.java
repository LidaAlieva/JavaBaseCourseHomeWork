package week1.homework;
/*Написать программу, которая при вводе числа в диапазоне от 1 до 99 добавляет к нему слово "копейка" в правильной форме.
Например, 1 копейка, 5 копеек, 42 копейки.
 */

import java.util.Scanner;

public class Task19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number 1-99");
        int number = sc.nextInt();

        if (number % 10 == 1 && number!= 11) {
            System.out.println(number + " " + "копейка");
        } else if (number >= 2 && number <= 4) {
            System.out.println(number + " " + "копейки");
        } else {
            System.out.println(number + " " + "копеек");
        }
    }
}
