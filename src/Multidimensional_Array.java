//In 2D array it is be like   1 2 3
//                            4 5 6
//                            7 8 9

//In this syntax would be  int[][] arr = new int[3][];
//Here it is mandatory to fill row but column is optional

import java.util.Scanner;
public class Multidimensional_Array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        System.out.println(arr.length); //no. of row
//        int[][] arr2D ={
//                {1, 2, 3}, //0th index
//                {4, 5, 6}, //1st index
//                {7, 8, 9}  //2nd index -> arr[2] = {6, 7, 8, 9}
//        };

        //input

        for(int row=0; row < arr.length; row++){
            //for each col. in the column
            for(int col=0; col < arr[row].length; col++){
                arr[row][col] = sc.nextInt();
            }
        }

        for(int row=0; row < arr.length; row++){
            //for each col. in the column
            for(int col=0; col < arr[row].length; col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}
