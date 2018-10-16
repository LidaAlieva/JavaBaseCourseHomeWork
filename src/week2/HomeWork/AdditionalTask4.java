package week2.HomeWork;
/*Порахувати кількість букв "а" (або будь-який інший символ, вводиться користувачем) в заданому рядку (стрічці).*/

import java.util.Scanner;

public class AdditionalTask4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the text");
        String text = sc.next();
        System.out.println("Enter a symbol");
        String symbol = sc.next();

        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if(text.substring(i, i + 1).equals(symbol)) {
                count++;
            }
        }
        System.out.println(count);



    }
}
