package week2.HomeWork;
/*Інвертувати масив (розвернути) без використання додаткового масиву.*/

import week2.ClassWork.ArrayUtils;

public class AdditionalTest2 {
    public static void main(String[] args){
        int[] array = ArrayUtils.generateArray(5,5);
        ArrayUtils.printArray(array);

        for (int i = 0; i < array.length / 2; i++) {
            int element = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = element;

        }
        ArrayUtils.printArray(array);


    }
}
