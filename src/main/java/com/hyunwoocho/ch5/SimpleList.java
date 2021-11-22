package com.hyunwoocho.ch5;

public class SimpleList {

    public static void main(String[] args) {
        int arr[] = new int[] {10, 20, 30, 40};

        for (int num : arr) {
            System.out.println(num);
        }

        System.out.println("remove the second value");

        for (int i = 1; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = 0;

        for (int num : arr) {
            System.out.println(num);
        }

        int newArr[] = new int[3];
        for (int i = 0; i < arr.length - 1; i++) {
            newArr[i] = arr[i];
        }

        for (int num : newArr) {
            System.out.println(num);
        }
    }

}
