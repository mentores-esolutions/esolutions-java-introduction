package com.esolutions.trainings.java.nivelacion.ex5;

public class ArrayUtils {
    public int sumOf(int[] arr) {
        int suma = 0;
        for (int i = 0; i < arr.length; i++) {
            suma = suma + arr[i];
        }
        return suma;
    }

    public int maxOf(int[] arr) {
        int mayor = arr[0];
        for (int i = 1;i < arr.length;i++)
        {
            if(mayor<arr[i]){
                mayor = arr[i];
            }
        }
            return mayor;
    }
}
