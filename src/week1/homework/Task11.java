package week1.homework;
/*Дано трехзначное число. Определить:
	а) верно ли, что все его цифры одинаковые;
	б) есть ли среди его цифр одинаковые.*/

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a three-digit number");
        int number = sc.nextInt();

        int thirdDigit = number % 10;
        number = number / 10;
        int secondDigit = number % 10;
        number = number / 10;
        int firstDigit = number;

        if (firstDigit == secondDigit && secondDigit == thirdDigit) {
            System.out.println("All digits are equal");
        } else if (firstDigit == secondDigit) {
            System.out.println("First digit = second");
        } else if (firstDigit == thirdDigit) {
            System.out.println("First digit = third");
        } else if (secondDigit == thirdDigit) {
            System.out.println("Second digit = third");
        } else {
            System.out.println("False");
        }

    }
}
