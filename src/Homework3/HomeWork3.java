package Homework3;

import java.util.Arrays;

public class HomeWork3 {

    public static void main(String[] args) {
        int len = 5;
        int initValue = 7;
        int [] array = initArr(len, initValue);

        invertArray();
        fillArray();
        changeArray();
        fillDiagonal();

        System.out.println(Arrays.toString(array)); //в конце для соблюдения порядка заданий.

        arrSort();
    }

    public static void invertArray() {
        int[] arr = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        for (int i = 0; i < arr.length; i++) {
           if (arr[i] == 1){
               arr[i] = 0;
           } else {
               arr[i] = 1;
           }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void fillArray() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
                arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void changeArray() {
        int[] arr = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void fillDiagonal() {
        int[][] arr = new int[4][4];
        int secIndex = arr.length - 1;
        for (int i = 0; i < 4; i++) {
            arr[i][i] = arr[i][secIndex - i] = 1;
            System.out.println(Arrays.toString(arr[i]));
        }
    }

    public static int [] initArr(int len, int initValue){
        int[] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = initValue;
        }
        return array;
    }

    public static void arrSort() {
        int[] arr = {345, 233, 424,432, 954, 359, 259, 239};
        Arrays.sort(arr);
        int min = arr[0];
        int max = arr[arr.length - 1];
        System.out.println("min = " + min + " max = " + max);
    }

}
