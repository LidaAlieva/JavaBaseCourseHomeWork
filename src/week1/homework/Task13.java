package week1.homework;
/*Дано 3 числа a, b, c. Визначити, чи є серед них хоча б пара рівних.*/

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a");
        int a = sc.nextInt();
        System.out.println("Enter b");
        int b = sc.nextInt();
        System.out.println("Enter c");
        int c = sc.nextInt();

        if (a == b) {
            System.out.println("first == second");
        } else if (a == c) {
            System.out.println("first == third");
        } else if (b == c) {
            System.out.println("second == third");

        }
    }
}
