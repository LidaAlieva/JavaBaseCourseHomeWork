package week2.HomeWork;
/*Вивести в консоль елементі тієї половини масиву, у якої середнє арифметичне максимальне*/

import week2.ClassWork.ArrayUtils;

public class Task8 {
    public static void main(String[] args) {
        int[] array = ArrayUtils.generateArray(10, 15);
        ArrayUtils.printArray(array);

        int arithmeticMean1 = 0;
        int arithmeticMean2 = 0;

        for (int i = 0; i < array.length / 2; i++) {
            arithmeticMean1 += array[i];
        }
        for (int i = array.length - 1; i < array.length / 2; i--) {
            arithmeticMean2 += array[i];
        }
        if ((arithmeticMean1 / array.length / 2) > (arithmeticMean2 / array.length / 2))
            for (int i = 0; i < array.length / 2; i++) {
                System.out.println(array[i] + " ");
            }
        else if ((arithmeticMean2 / array.length / 2) > (arithmeticMean1 / array.length / 2))
            for (int i = array.length - 1; i < array.length / 2; i--) {
                System.out.println(array[i] + " ");
            }
    }
}


