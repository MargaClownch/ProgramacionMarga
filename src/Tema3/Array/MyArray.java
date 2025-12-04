package Tema3.Array;

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
        for(int i = 0 ; i< arr.length; i++){
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
    public static int arrayCheck(int arr []){
        return 0;
    }
}
