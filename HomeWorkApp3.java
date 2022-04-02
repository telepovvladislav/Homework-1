/**
 * Java 1. Homework 3
 *
 * @author Telepov Vladislav
 * version 02.04.2022
 */
import java.util.Arrays;
import java.util.Random;

class HomeWorkApp3 {
    static Random random = new Random();
    
    public static void main(String[] args) {
        // 1.
        int[] arrOne = createAndFillArray(10, true, 2);
        System.out.println(Arrays.toString(arrOne));
        for (int i = 0; i < arrOne.length; i++) {
            arrOne[i] = 1 - arrOne[i];
        }
        System.out.println(Arrays.toString(arrOne));
      
        // 2.
        int[] arrTwo = createAndFillArray(100, false, 1);
        System.out.println(Arrays.toString(arrTwo));
       
        // 3.
        int[] arrThree = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(arrThree));
        for (int i = 0; i < arrThree.length; i++) {
            if (arrThree[i] < 6) {
                arrThree[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(arrThree));
      
        // 4.
        int[][] matrix = new int[5][5];
        for (int i = 0; i < matrix.length; i==) {
            matrix[i][i] = 1;
            matrix[i][matrix.length - i - 1] = 1;
        }
        for (int i = 0; i < matrix.length; i++; {
            System.out.println(Arrays.toString(matrix[i]));
        }
        
        // 5.
        int[] arrFive = createAndFillArray(15, 5);
        System.out.println(Arrays.toString(arrFive));
    }
}
