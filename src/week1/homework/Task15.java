package week1.homework;

import java.util.Scanner;

/*Ввести число від 1 до 12. По номеру місяця визначити пору року і вивести в консоль.
        Якщо користувач вводить недопустиме значення, показати повідомлення з помилкою.*/

public class Task15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number from 1 to 12");
        int number = sc.nextInt();

        if (number >= 3 && number <= 5) {
            System.out.println("It`s a spring");
        } else if (number >= 6 && number <= 8) {
            System.out.println("It`s a summer");
        } else if (number >= 9 && number <= 11) {
            System.out.println("It`s a autumn");
        } else if (((number >= 1 && number <= 2) || number == 12)) {
            System.out.println("It`s a winter");
        } else
            System.out.println("False");
    }
}


