package week1.homework;
/*Определить, является ли шестизначное число "счастливым" (сумма первых трех цифр равна сумме последних трех цифр).*/

import java.util.Scanner;

public class Task22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a six-digit number");
        int number = sc.nextInt();

        int lastNumber6 = number % 10;
        number /= 10;
        int lastNumber5 = number % 10;
        number /= 10;
        int lastNumber4 = number % 10;
        number /= 10;
        int lastNumber3 = number % 10;
        number /= 10;
        int lastNumber2 = number % 10;
        number /= 10;
        int lastNumber1 = number;

        if ((lastNumber1 + lastNumber2 + lastNumber3) == (lastNumber4 + lastNumber5 + lastNumber6)) {
            System.out.println("You`r lucky");
        } else {
            System.out.println("You`r loser");
        }
    }


}
