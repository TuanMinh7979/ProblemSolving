package Sort;

import common.arrayUtils;

public class HeapSort {
    private void heapify(int [] a, int n, int i){
        int l= 2*i+1;
        int r=2 *i +2;
        int largest=i;
        arrayUtils ar= new arrayUtils();

        if(l<n && a[l]> a[i]){
            largest= l;
        }
        if(r< n&& a[r]> a[i]){
            largest= r;
        }
        if(largest != i){
           ar.swap(a, largest, i);
        }

    }
    private void heapSort(int [] arr, int n){
        arrayUtils ar= new arrayUtils();
        for(int i=n/2-1; i>=0; i--){
            //tu nut goc trai cuoi cung
            heapify(arr, n, i);
            //xay dung maxheap
        }
        for(int j=n-1; j>=0; j--){
            ar.swap(arr,j , 0);
            heapify(arr, j,0);
        }

    }

    public static void main(String[] args) {
        arrayUtils ar= new arrayUtils();
        int []inp={34,12,45,67,11};
        HeapSort hs= new HeapSort();
        hs.heapSort(inp, 5);
        ar.printRs(inp);

    }
}
