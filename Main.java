package com.company;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    private static int i;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кол-во линий массива:");
        int y = scanner.nextInt();
        System.out.println("Введите кол-во сталбцов массива:");
        int x = scanner.nextInt();
        int matrix[][] = new int[y][];
        for (int i = 0; i < y; i++) {
            matrix[i] = new int[x];
            for (int j = 0; j < x; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        for ( int i = 0; i < matrix.length * matrix[0].length - 1; ++i ) {
            for ( int j = i + 1; j < matrix.length * matrix[0].length; ++j ) {
                if ( matrix[j / matrix[0].length][j % matrix[0].length] < matrix[i / matrix[0].length][i % matrix[0].length] ) {
                    int tmp = matrix[j / matrix[0].length][j % matrix[0].length];
                    matrix[j / matrix[0].length][j % matrix[0].length] = matrix[i / matrix[0].length][i % matrix[0].length];
                    matrix[i / matrix[0].length][i % matrix[0].length] = tmp;
                }
            }
        }

        for ( int i = 0; i < matrix.length; ++i )
            System.out.println(java.util.Arrays.toString(matrix[i]));

        Arrays.sort(matrix, Comparator.comparingInt(arr -> arr[i]));
        System.out.println(Arrays.toString(matrix[i]));
    }

}