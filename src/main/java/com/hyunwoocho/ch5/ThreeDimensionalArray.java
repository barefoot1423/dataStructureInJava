package com.hyunwoocho.ch5;

public class ThreeDimensionalArray {

    public static void main(String[] args) {
        int threeDimensionalArray[][][] = new int[][][] {
            {{1, 2, 3, 1, 2, 3}, {4, 5, 6, 4, 5, 6}, {1, 2, 3, 4, 5, 6}},
            {{7, 8, 9, 7, 8, 9}, {10, 11, 12, 10, 11, 12}, {1, 2, 3, 4, 5, 6}}
        };

        System.out.println(threeDimensionalArray.length);
        System.out.println(threeDimensionalArray[0].length);
        System.out.println(threeDimensionalArray[0][0].length);

        for (int i = 0; i < threeDimensionalArray.length; i++) {
            for (int j = 0; j < threeDimensionalArray[0].length; j++) {
                for (int k = 0; k < threeDimensionalArray[0][0].length; k++) {
                    System.out.println("threeDimensionalArray[" + i + "][" + j + "][" + k + "] = " + threeDimensionalArray[i][j][k]);
                }
            }
        }


    }

}
