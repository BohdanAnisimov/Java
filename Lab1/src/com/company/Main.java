package com.company;
import java.util.Arrays;

public class Main {
    //Task 1
    private static void printArray(int[][] arr)
    {
        for(int i = 0; i < 4; i++)
        {
            for(int j = 0; j < 4; j++)
            {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
    private static void evenDigits(int[][] arr)
    {
        for(int i = 0; i < 4; i++)
        {
            if(arr[i][3-i] % 2 == 0)
            {
                System.out.print(arr[i][3-i]);
            }
        }
    }

    //Task 2
    private static int[] fillArray(int begin, int end, int step)
    {
        int arraySize = (end / step) + 1;
        int[] array = new int[arraySize];
        int currentNumber = begin;
        for(int i = 0; i < arraySize; i++)
        {
            array[i] = currentNumber;
            currentNumber += step;
        }
        return array;
    }

    public static void main(String[] args) {
        //Task 1
        int[][] array = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                array[i][j] = (int) (Math.random() * 10);
            }
        }
        System.out.println("Створений двовимірний масив (завдання 1):");
        printArray(array);
        System.out.println("Парні числа побічної діагоналі:");
        evenDigits(array);

        System.out.println();
        //Task 2
        System.out.println("Створений масив (завдання 2):");
        System.out.println(Arrays.toString(fillArray(0, 20, 3)));
    }
}
