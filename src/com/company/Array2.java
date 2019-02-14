package com.company;

public class Array2 {

    public static void main(String[] args) {
        double a[][] = {
                {2.78, 6.11, 3.45},
                {2.13, 3.52, 4.21},
                {1.11, 8.31, 26.25}};
        int max = 0;
        double maxmax = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > a[i][max]) {
                    max = j;
                }

            }

            if (maxmax < a[i][max]) {
                maxmax = a[i][max];
            }
        }
        System.out.println(maxmax);
    }
}



