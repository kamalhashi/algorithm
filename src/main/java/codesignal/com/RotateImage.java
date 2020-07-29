package codesignal.com;

import jdk.management.resource.internal.inst.FileOutputStreamRMHooks;

import java.util.Arrays;

/**
 * Note: Try to solve this task in-place (with O(1) additional memory),
 * since this is what you'll be asked to do during an interview.
 * You are given an n x n 2D matrix that represents an image.
 * Rotate the image by 90 degrees (clockwise).
 * a = [[1, 2, 3],
 *      [4, 5, 6],
 *      [7, 8, 9]]
 *
 *  rotateImage(a) =
 *     [[7, 4, 1],
 *      [8, 5, 2],
 *      [9, 6, 3]]
 */





public class RotateImage {

    //Brute force , not too quick.
    //Row  becomes the new column and the column becomes the new row
    //This is copying into new array , space complexity
    public static  int[][] solutionWithSpaceComplexity(int[][] a){
        //cycle to traverse
        int row = a.length;
        int column = a.length;
        int[][] newArray= new int [row] [column];

        // O(2)
        for (int i = 0; i < column; i++) {
            int x = row -1;
            for (int j = 0; j < row ; j++) {
                newArray[i][j]= a[x--][i];
            }
            print(newArray);
        }
        return newArray;

    }

    //No need a new array , just swap
    public static int[][] solutionNoSpaceComplexity(int[][] matrix){
        //get the length of the image or the array
        int N= matrix.length;
        //turn row to columns
        for (int i = 0; i < N ; i++) {
            for (int j = i; j < N ; j++) {
                int temp= matrix[i][j];
                //set row-column equal to column-row
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;

            }
        }

        for (int i = 0; i <  N; i++) {
            //Only traverse half way , no need to go all the way
            for (int j = 0; j < (N/2); j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][N-1];
                matrix[i][N-1-j] = temp;
            }
            print(matrix);
        }

        print(matrix);


        return matrix;
    }

    public static void print (int[][] a){
        for (int i = 0; i < a.length ; i++) {
            System.out.println(Arrays.toString(a[i]));
        }
    }

    public static  void main (String[] args) {

        int [][] a = new int [][] {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        solutionNoSpaceComplexity(a);
    }

}
