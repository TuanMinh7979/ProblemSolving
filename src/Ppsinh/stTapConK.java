package Ppsinh;

import common.arrayUtils;

public class stTapConK {
    private void stlkK(int k, int n){
         arrayUtils ar= new arrayUtils();
         //theo thu tu tu dien tuc la tang dan
        //gia tri khoi tao 1,2,2 voi k =3;
        int[] initarr= new int[k];

        for(int i=0; i<k-1 ;i++){
            initarr[i]=i+1;
        }
        initarr[k -1]= initarr[k-2];
        //tim phan tu chua dat toi gioi han tren
        while(true) {
            ar.printRs(initarr);
            int i = k - 1;
            while (i >= 0 && initarr[i] == n - k + i + 1) i--;
            //th1: neu tim thay ta tang no len 1
            if(i<0) return;
            initarr[i] += 1;
            for (int j = i + 1; j <= k - 1; j++) {
                initarr[j] = initarr[j - 1] + 1;
            }

        }
    }

    public static void main(String[] args) {
      stTapConK lk= new stTapConK();
      lk.stlkK(3,5);
    }
}
