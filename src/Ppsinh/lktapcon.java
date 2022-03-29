package Ppsinh;

public class lktapcon {


    private void printRs(int[] arr) {
        for (int k = 0; k < arr.length; k++) System.out.print(arr[k] + " ");
        System.out.println("");

    }

    void lktapconk(int k, int n) {
        //moi tap con se co k phan tu dau tien tao 1 for k
        //gs k =2 n =5
        int[] arr = {0, 0,0};

        int len = arr.length;
        int count = 0;
        while (count < 21) {
            for (int i = len - 1; i >= 0; i--) {
                while (arr[i] < (n - k + i +1)) {
                    System.out.println("nho hon "+arr[i]+ " < "+(n-k+i +1));
                    arr[i] = arr[i] + 1;
                    int j = i + 1;
                    while (j <= len - 1) {
//                        System.out.println("vh");
                        arr[j] = arr[j - 1] + 1;
                        j++;
                    }
                    i = len - 1;
                    printRs(arr);

                }


            }
            count++;
        }

    }
    private void lktapcon2(int k , int n){
        int[] arr = {1, 2,2};

        int len = arr.length;
        while(true){
            //tim index cua phan tu co val < n -k +i
//            for (j=k-1;subA[j]==n-k+j && j>=0;j--);
           int j=k-1;
           while(j>=0 && arr[j]==n-k+j+1){
               j--;
           }
           if(j<0) return;
           arr[j]=arr[j]+1;
           for(int l=j+1; l<=k-1; l++){
               arr[l]=arr[l-1]+1;
           }
            printRs(arr);

        }
    }

    public static void main(String[] args) {
        lktapcon lk = new lktapcon();
        lk.lktapconk(3, 5);
    }

}
