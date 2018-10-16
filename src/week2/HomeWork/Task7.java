package week2.HomeWork;
/*Знайти середнє арифметичне масиву.*/

import week2.ClassWork.ArrayUtils;

public class Task7 {
    public static void main(String[] args) {
        int[] array = ArrayUtils.generateArray(10, 20);
        ArrayUtils.printArray(array);

        int arithmeticMean = 0;

        for (int i = 0; i < array.length; i++) {
            arithmeticMean += array[i];
        }
        System.out.println(arithmeticMean / array.length);
    }
}
