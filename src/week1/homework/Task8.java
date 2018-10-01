package week1.homework;
/*Вводим два числа, сравнить последнии цифры этих чисел (пользоваться оператором %)
			124    4    -   true
			1456   567  -   false
			1      2    -   false
			18     98   -   true*/

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int first = sc.nextInt();
        System.out.println("Enter 2d number");
        int second = sc.nextInt();

        int lastNumber1 = first % 10;
        int lastNumber2 = second % 10;

        if (lastNumber1 == lastNumber2)
            System.out.println("True");
        else {
            System.out.println("False");

        }

    }
}
