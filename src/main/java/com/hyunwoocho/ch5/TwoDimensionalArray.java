package com.hyunwoocho.ch5;

public class TwoDimensionalArray {

    public static void main(String[] args) {
        int twoDimensionalArray[][] = new int[][] {{1, 2, 3, 4}, {5, 6, 7, 8}};

        System.out.println(twoDimensionalArray.length);
        System.out.println(twoDimensionalArray[0].length);

        for (int i = 0; i < twoDimensionalArray.length; i++) {
            for (int j = 0; j < twoDimensionalArray[0].length; j++) {
                System.out.println("twoDimensionalArray[" + i + "][" + j + "] = " + twoDimensionalArray[i][j] );
            }
        }
    }

}
