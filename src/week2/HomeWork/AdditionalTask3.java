package week2.HomeWork;

import java.util.Scanner;
/*Перевірити, чи являється задане число простим.*/
public class AdditionalTask3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int number = sc.nextInt();

        boolean res = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) res = false;

        }
        System.out.println(res);


    }
}
