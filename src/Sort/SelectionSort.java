package Sort;

//can duy try arr theo thu tu tang dan
//buoc sau can dua gia tri nho nhat vao sau mang da dc sap xep o buoc truoc
//lay thang dau tien doi cho voi min cua mang con lai
//thang dau tien ++, va tiep tuc doi cho voi min cua mang con lai
public class SelectionSort {

    public static int[] selectionSort(int nums[]) {
        int count=0;
        //ta lap lai viec tim phan tu nho nhat trong mang n -> n-1 -> n-2 =-> 2 ->1 phan tu
        int len = nums.length;
        for (int i = 0; i < len - 1; i++) {
//            for (int j = len - 1; j >= i; j--) {
//                if (nums[j] < nums[i]) {
//                    int temp = nums[j];
//                    nums[j] = nums[i];
//                    nums[i] = temp;
//                    count ++;
//                }
//            }
            int minidx=i;
            for (int j = i+1 ; j < len; j++) {
                if (nums[j] < nums[minidx]) {
                    System.out.println(nums[i]+" "+nums[j]);
                    minidx=j;
                }
            }
            int temp = nums[minidx];
            nums[minidx] = nums[i];
            nums[i] = temp;
        }

        return nums;

    }

    //BY GOG
    static void sort(int arr[])
    {
        int count=0;
        int n = arr.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                    System.out.println(arr[min_idx]+" - "+arr[j]);
                }

            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
        System.out.println("count la "+ count);
    }
    void changeItem(int [] arr){

        arr[0]=20;
    }

    public static void main(String[] args) {
        int[] arr={8,5,6,3,2,9,10};
//       arr=selectionSort(arr);
       // sort(arr);
        SelectionSort se= new SelectionSort();
        se.changeItem(arr);
        for(Integer numi : arr){
            System.out.println(numi);
        }

    }
}
