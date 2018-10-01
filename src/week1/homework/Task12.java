package week1.homework;
/*Відомі дві швидкості, одна в км за годину, інша в метрах за секунду. Яка з них більша?*/

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter speed in Km/H");
        double KmH = sc.nextDouble();
        System.out.println("Enter speed in m/s");
        double mS = sc.nextDouble();

        double mSToKmH = mS * 1000 / 3600;
        System.out.println(KmH == mSToKmH);


    }
}
