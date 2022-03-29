package Ppsinh;

public class generateDayNP {
    private void printRs(int []arr){
        for (int k=0; k<arr.length; k++) System.out.print(arr[k]+" ");
        System.out.println("");

    }
    private void Try(int n){

        int[] arr;
        arr = new int[n];
        int len = arr.length;

        int count= 0;
         while(count <6) {
             for (int i = len - 1; i >= 0; i--) {
                 if (arr[i] == 0) {
                     arr[i] = 1;
                     int j = i + 1;
                     while (j <= len - 1) {
                         arr[j] = 0;
                         j++;

                     }
                     printRs(arr);
                 }
             }
             count ++;
         }



    }

    public static void main(String[] args) {
        generateDayNP lk= new generateDayNP();
                lk.Try(3);
    }
}
