package Backtracking;

public class lkAllThChapkOfn {
    //voi moi value trong th xi <= n -k +i
    private void printRs(int []arr){
        for (int k=0; k<arr.length; k++) System.out.print(arr[k]+" ");
        System.out.println("");

    }
//    private void Try(int idx, int lenTh, int lenInp ,int[] arr){
//        for(int rv=1; rv<= lenInp-lenTh+idx; rv++) {
//            arr[idx]=rv;
//            if (idx == lenTh-1) {
//                printRs(arr);
//            }else{
//
//                Try(idx+1,lenTh, lenInp, arr);
//            }
//        }
//
//    }
    private void Try(int idx,boolean[] checked ,int k, int n, int[] arr){
        arrayUtils ar= new arrayUtils();
        for(int i=0; i<=n-k+idx; i++) {
            // voi moi lan lap ta can thay doi gia tri cua idx len 1
            if (!checked[i]) {
//                System.out.println("vd");
                arr[idx] = i+1;
                checked[i] = true;
                if (idx == k - 1) {
                    //arr da day
                    ar.printRs(arr);
                    checked[i]=false;
                } else {
                    //tiep tuc goi de quy voi i+1
//                    checked[i] = true;
                    Try(idx + 1,checked, k, n, arr);
                    checked[i]=false;
                }
            }


        }

    }

    public static void main(String[] args) {
        lkAllThChapkOfn lk= new lkAllThChapkOfn();
        boolean[] checked= new boolean[5];
         lk.Try(0,checked,3,5,new int[3]);
    }
}
