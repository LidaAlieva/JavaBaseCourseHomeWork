package week1.homework;
/*Вводим два числа, если одно из них делиться на другое без остатка, то выводим тру и показываем результат деления
(целую часть от деления  и остачу), в другом случае выводим false и показываем результат деления
(целую часть от деления  и остачу)
 */

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int first = sc.nextInt();
        System.out.println("Enter 2d number");
        int second = sc.nextInt();
        int remainder = first % second;
        if (remainder == 0) {
            System.out.println("True" + first / second);
            System.out.println("Remainder" + remainder);
        } else {
            System.out.println("False" + first / second);
            System.out.println("Remainder" + remainder);
        }
    }
}

