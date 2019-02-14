package com.company;

public class Array1 {

    public static void main(String[] args) {
        double[] array = {1.32, -3.81, 1.32, -1.75, -0.38, -0.38, -0.97, -2.58, -0.97};
        double[] arrayNew = new double[array.length];
        int counterForArrayNew = 0;
        boolean checkTheSame = false;

        System.out.println("Исходный массив");
        for (int i = 0; i < arrayNew.length; i++) {
            System.out.print(array[i] + ", ");
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j] & i != j) {
                    checkTheSame = false;
                }
            }
            if (!checkTheSame) {
                arrayNew[counterForArrayNew++] = array[i];
            }
            checkTheSame = true;

        }
        System.out.println();
        System.out.println("Новый массив:");
        for (int i = 0; i < arrayNew.length & arrayNew[i] != 0; i++) {
            System.out.print(arrayNew[i] + ", ");
        }


    }
}