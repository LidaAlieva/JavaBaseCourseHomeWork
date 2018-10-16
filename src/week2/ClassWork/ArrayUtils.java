package week2.ClassWork;

public class ArrayUtils {
    public static int[] generateArray(int length, int limit) {
        int[] resultArray = new int[length];

        for (int i = 0; i < length; i++) {
            double random = Math.random(); // 0.3, 0.254534, 0.911343, 0.03
            int element = (int) (limit * random);
            resultArray[i] = element;
        }

        return resultArray;
    }
    public static int[] generateArrayFrom25To75(int length, int minLimit, int maxLimit) {
        int[] resultArray = new int[length];

        for (int i = 0; i < length; i++) {
            double random = Math.random(); // 0.3, 0.254534, 0.911343, 0.03
            int element = (int) (random * (maxLimit - minLimit) + minLimit);
            resultArray[i] = element;
        }

        return resultArray;
    }


    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.print("\n");
    }

    public static int[] generateRandomArray(int length, int limit) {
        int[] resultArray = new int[length];

        for (int i = 0; i < length; i++) {
            double random = Math.random();
            int element = (int) (limit * random);

            if (i % 2 == 0) {
                if (element % 2 == 0) {
                    resultArray[i] = element;

                } else {
                    if (element + 1 > limit) {
                        resultArray[i] = --element;

                    } else {
                        resultArray[i] = ++element;
                    }
                }
            } else if (i % 2 != 0) {
                if (element % 2 != 0) {
                    resultArray[i] = element;

                } else {
                    if (element + 1 > limit) {
                        resultArray[i] = --element;

                    } else {
                        resultArray[i] = ++element;
                    }

                }
            }
        }
        return resultArray;
    }

}





