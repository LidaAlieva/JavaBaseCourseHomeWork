package week2.HomeWork;

import week2.ClassWork.ArrayUtils;

import java.util.Arrays;

/*Дано два масиви однакової довжини з будь-якими значеннями. Скопіювати дані з першого масиву в другий.*/
public class Task4 {
    public static void main(String[] args) {
        int[] array = ArrayUtils.generateArray(5, 10);
        ArrayUtils.printArray(array);
        int[] array2 = ArrayUtils.generateArray(5, 10);
        ArrayUtils.printArray(array2);

        int[] arraycopy = Arrays.copyOf(array, 5);

        ArrayUtils.printArray(arraycopy);


    }


}

