package common;

import java.util.Arrays;
import java.util.List;

public class arrayUtils {
    public void printRs(int[] arr) {
        for (int k = 0; k < arr.length; k++) System.out.print(arr[k] + " ");
        System.out.println("");

    }

    public int minIdx(int[] arr) {
        int minIdx = 0;
        int minVal = 9;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minVal) {
                minIdx = i;
                minVal = arr[i];
            }
        }
        return minIdx;
    }

    public int MinComIdx(int com, int[] arr, int from) {
        int minIdx = 0;
        int minVal = 9;
        for (int i = from; i < arr.length; i++) {
            if (arr[i] < minVal && arr[i] > com) {
                minIdx = i;
                minVal = arr[i];
            }
        }
        return minIdx;
    }

    public int FirstIofLastDesArr(int[] arr) {
        int len = arr.length;
        int j = len - 2;
        while (j >= 0 && arr[j] > arr[j + 1]) {
            j--;
        }

        return j;

    }

    public int FirstIofLastDesArr(String[] arr, List<String> ori) {
        int len = arr.length;
        int j = len - 2;
        while (j >= 0 && ori.indexOf(arr[j]) > ori.indexOf(arr[j + 1])) j--;
        return j;
    }

    public int MinComIdx(String com, String[] arr, int from, List<String> ori) {
        int minIdx = 0;
        int minVal = ori.size() - 1;
        for (int i = from; i < arr.length; i++) {
            if (ori.indexOf(arr[i]) <= minVal && ori.indexOf(arr[i]) > ori.indexOf(com)) {
                minIdx = i;
                minVal = ori.indexOf(arr[i]);
            }
        }
        return minIdx;
    }
    public int MinComIdxGT(String com, String[] arr, int from, List<String> ori, List<String> gt) {
        int minIdx = -1;
        int minVal = ori.size() - 1;
        for (int i = from; i < arr.length; i++) {
            if (ori.indexOf(arr[i]) <= minVal && ori.indexOf(arr[i]) > ori.indexOf(com) && gt.indexOf(arr[i])>0) {
                minIdx = i;
                minVal = ori.indexOf(arr[i]);
            }
        }
        return minIdx;
    }



    public void inverse(int[] arr, int from, int to) {
        while (from < to) {
            int temp = arr[from];
            arr[from] = arr[to];
            arr[to] = temp;

            from++;
            to--;
        }

    }

    public void inverse(String[] arr, int from, int to) {
        while (from < to) {
            String temp = arr[from];
            arr[from] = arr[to];
            arr[to] = temp;

            from++;
            to--;
        }

    }

    public void printStringArr(String[] arrStr) {
        for (String item : arrStr) {
            System.out.print(item + " ");
        }
        System.out.println(" ");
    }

    public <T> T[] subArray(T[] array, int beg, int end) {
        return Arrays.copyOfRange(array, beg, end + 1);
    }

    public void swap(int[] arr, int a, int b){
        int temp= arr[a];
        arr[a]=arr[b];
        arr[b]= temp;

    }
    public static void main(String[] args) {


    }
}
