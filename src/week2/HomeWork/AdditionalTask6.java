package week2.HomeWork;
/*Замінити в стрічці всі символи "а" на "@", вивести отриманий результат. Наприклад:
	"array is a data type" -> "@rr@y is @ d@t@ type"*/

import java.util.Scanner;

public class AdditionalTask6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the text");
        String text = sc.next();


        for (int i = 0; i < text.length(); i++) {

        }
        System.out.println(text.replace('a', '@'));
    }

}
