package Ppsinh;

import common.arrayUtils;

public class stlkHoanvi {

    private void lk(int k) {
        arrayUtils ar = new arrayUtils();
        //theo thu tu tu dien tuc la tang dan
        //gia tri khoi tao 1,2,2 voi k =3;
        int [] arr = new int[k];

        for (int i = 0; i <= k - 1; i++) {
            arr[i] = i + 1;
        }


        while (true) {
            ar.printRs(arr);
            int i = ar.FirstIofLastDesArr(arr);
            if (i < 0) return;
//            System.out.println("i index la "+i+" val la "+arr[i]);
            // da sap xep tang dan
            int bidx = ar.MinComIdx(arr[i], arr, i + 1);
            int temp = arr[bidx];
            arr[bidx] = arr[i];
            arr[i] = temp;

            int a = i + 1, b = k - 1;
            ar.inverse(arr, a, b);

        }


    }

    public static void main(String[] args) {
        stlkHoanvi lk = new stlkHoanvi();
        lk.lk(5);
    }
}
