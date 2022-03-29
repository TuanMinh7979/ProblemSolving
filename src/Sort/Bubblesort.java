package Sort;
//thuc hien n-1 lan:
//moi lan so sanh doi mot tu doc theo mang
public class Bubblesort {
    static void bulblesort(int arr[]){
        int count=0;

        int len = arr.length;
        for(int i=0; i< len -1;i++){
            for(int j=0; j<len -1 -i; j++){
                if(arr[j+1]< arr[j]){
                    //swap
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                   count++;
                }
            }

        }
        System.out.println("count la "+ count);

    }


   static void bubbleSort(int arr[])
    { int count=0;
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    count++;
                }
        System.out.println("count la "+ count);
    }

    /* Prints the array */
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int [] arr={1,7,5,3,9};
        double startTime= System.nanoTime();
        //thuat toan
        bulblesort(arr);
        double endTime=System.nanoTime();
        double exetime=(endTime-startTime)/1000000000;
        System.out.println("TIME EXECUTE: "+exetime);


        printArray(arr);

    }
}
