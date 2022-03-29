package Sort;
//j =i+1
//so sanh j voi tu 0 den i
//neu nho hon thi chen vao phan tu j truoc phan tu do
public class InsertSort {

    static void insertSort(int arr[]){
        int len= arr.length;
       for(int i =1; i< len ; i++){
          int j=i-1;
          int key=arr[i];
          while(j>=0 && arr[j] >key){
              arr[j+1]= arr[j];
              j--;
          }
           System.out.println("i la" +i+" arr[i] la: "+arr[i]);
           System.out.println("key la: "+ key);
          arr[j+1]= key;
       }


    }

    public static void main(String[] args) {
        int[] arr={8,5,6,3,2,9,10};
        insertSort(arr);
        for(int item : arr) System.out.println(item+ " ");
    }
}
