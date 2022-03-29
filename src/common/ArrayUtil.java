package common;

public class ArrayUtil {
    public static void printIntArr(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }

    }

    public static int sumArr(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
    public static void print2Darr(int[][] arr){
        for(int[]  subarr: arr){
            for(int i :subarr){
                System.out.print(i+" ");
            }
            System.out.println("");
        }

    }
}
