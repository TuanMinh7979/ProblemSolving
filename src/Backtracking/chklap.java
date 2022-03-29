package Backtracking;

public class chklap {

    private void printRs(int []arr){
        for (int k=0; k<arr.length; k++) System.out.print(arr[k]+" ");
        System.out.println("");

    }
    private void chkl(int idx, boolean[] check,int lenTh, int lenInp ,int[] arr){
       for(int i=1; i<=lenInp; i++){
       if(!check[i-1]){
           //if chua dc liet ke
           arr[idx]=i;
           if(i==lenInp){
               printRs(arr);
           }else{
               check[i-1]=true;
               chkl(idx+1, check, lenTh, lenInp, arr);
               check[i-1]=false;
           }
       }
       }
    }

    public static void main(String[] args) {
        boolean check[]= new boolean[5];
        int [] arr={1,2,3};
        chklap lk= new chklap();
         lk.chkl(0, check, 3, 5,arr);
    }
}
