package com.hyunwoocho.beginningJavaDS.ch2.practice;

import java.util.Arrays;

public class BubbleSort {

    public int[] sort(int[] numbers) {

        for (int i = 1; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j + 1];
                    numbers[j + 1] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(numbers));
        return numbers;
    }

}
