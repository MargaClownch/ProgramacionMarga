package Tema3.Array;

import java.util.Arrays;

public class MyArray {
    public static void imprimirArray(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static int arrayMax(int arr []){
        int max = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    public static int arrayMin(int arr []){
        int min = arr[0];
        for(int i = 0 ; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
    public static int arrayAverage(int arr []){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum/arr.length;
    }
    public static boolean arrayCheck(int arr [], int check){
         for(int i = 0; i < arr.length;i++){
            if(arr[i] == check){
                return true;
            }
         } return false;
    }
    public static int[] arraySum(int arr [], int arr2[]){
        int[] arr3 = new int[arr.length];
        for(int i = 0;i < arr.length;i++){
            arr3[i] = arr[i] + arr2[i];
        } return arr3;
    }
    public static int[] arrayRes(int arr [], int arr2[]){
        int[] arr3 = new int[arr.length];
        for(int i = 0;i < arr.length;i++){
            arr3[i] = arr[i] - arr2[i];
        } return arr3;
    }
    public static int[] arrayMult(int arr [], int arr2[]){
        int[] arr3 = new int[arr.length];
        for(int i = 0;i < arr.length;i++){
            arr3[i] = arr[i] * arr2[i];
        } return arr3;
    }
    public static int[] arrayInv(int arr []){
        int[] arr2 = new int[arr.length];
        int counter = 0;
        for(int i = arr.length - 1; i >= 0; i--){
            arr2[counter] = arr[i];
            counter++;
        }
        return arr2;
    }
    public static void arrayInvProcedimiento(int arr []){
        int counter = 0;
        for(int i = 0; i < arr.length/2; i++){
            int j = arr.length - 1 - i;
            int auxiliar = arr[i];
            arr[i] = arr[j];
            arr[j] = auxiliar;
        }
    }
    public static boolean arrayCapicua(int arr []) {
        for (int i = 0; i < arr.length / 2; i++) {
            int j = arr.length - 1 - i;
            if (arr[i] != arr[j]) {
                return false;
            }
        }
        return true;
    }
}
