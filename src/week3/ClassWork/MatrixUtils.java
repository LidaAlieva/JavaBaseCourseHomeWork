package week3.ClassWork;

public class MatrixUtils {
    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            int[] innerArray = array[i];

            for (int j = 0; j < innerArray.length; j++) {
                System.out.print(array[i] + " ");

            }
        }
        System.out.print("\n");

    }
}
