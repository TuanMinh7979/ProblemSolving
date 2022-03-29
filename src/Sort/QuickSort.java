package Sort;


public class QuickSort {
    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j <= high - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i+1, high);
        return i+1;
    }
    private void Qs(int [] arr, int low, int high){
        if(low<high){
            int pi=partition(arr, low, high);
            Qs(arr, low, pi-1);
            Qs(arr, pi+1, high);
        }
    }

    public static void main(String[] args) {
        int [] arr={1,7,5,3,9};
        QuickSort obj= new QuickSort();

        double startTime= System.nanoTime();
        //thuat toan
        obj.Qs(arr, 0, arr.length-1);
        double endTime=System.nanoTime();
        double exetime=(endTime-startTime)/1000000000;
        System.out.println("TIME EXECUTE: "+exetime);




        arrayUtils ar=new arrayUtils();
        ar.printRs(arr);
    }
}
