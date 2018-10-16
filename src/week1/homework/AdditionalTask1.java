package week1.homework;
/*Перевод с числа с десятичной системы счисления в двоичную, и наоборот. Пользователь сам вводит число*/

import java.util.Scanner;

public class AdditionalTask1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int number = sc.nextInt();
        System.out.println(Integer.toBinaryString(number));
        System.out.println("Enter a binary number");
        String binaryNumber = sc.next();
        System.out.println(Integer.parseInt(binaryNumber, 2));

    }


}

