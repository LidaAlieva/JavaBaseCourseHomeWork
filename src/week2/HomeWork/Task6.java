package week2.HomeWork;
/*Заповнити масив випадковими значеннями. На парних індексах парними значеннями, на непарних індексах - непарними.*/

import week2.ClassWork.ArrayUtils;

public class Task6 {
    public static void main(String[] args){
        int[] array = ArrayUtils.generateRandomArray(10,10); //в папці ArrayUtils метод, що задовольняє умову задачі.
        ArrayUtils.printArray(array);
    }
}
