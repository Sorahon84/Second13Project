package org.example.ProjectSecond10;

public class HomeWork {
    public static void main(String[] args) {
        int[][] number = {
                {1, 2, 3},//1 array 1 row
                {10, 20, 30, 40, 50},//2 arrays or 2 row
                {100, 200}//3 arrays or 3 row

        };
        System.out.println(number.length);
        // when we use two pairs of [] we pull entire 1d array
        int [] arr= number[0];
        // when we use two pairs of [][] we pull individual elements  2d array
        int arr1 = number[0][1];
        System.out.println();
        System.out.println(arr1);
        System.out.println();
        System.out.println(number[1].length);
    }
}
