package Backtracking;

public class lkNhiPhan {
    //0 1 2
    void printRs(int []arr){
        for (int k=0; k<arr.length; k++) System.out.print(arr[k]+" ");
        System.out.println("");

    }
//    void Try(int idx,int len, int[] arr){
//        for(int j=0; j<=1; j++){
//            arr[idx]=j;
////            System.out.println("vao day");
//            if(idx == len-1){
//                printRs(arr);
////                System.out.println("neu arr day thi in arr ra man hinh");
//            }else{
//                Try(idx+1, len, arr);
//            }
//        }
//
//
//    }


    void Try(int idx, int len, int []arr){

        for(int i=0; i<=1; i++){
            arr[idx]=i;
            if(idx==len-1){
                printRs(arr);
            }else {

                Try(idx + 1, len, arr);
            }
        }

    }

    public static void main(String[] args) {
        lkNhiPhan lk = new lkNhiPhan();
        lk.Try(0, 3, new int[3]);

    }


}
