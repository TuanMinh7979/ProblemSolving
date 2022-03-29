package Ppsinh;

import common.arrayUtils;

public class stNhiPhanN {
    private void stNhiphann(int[] arr, int n) {
        arrayUtils ar = new arrayUtils();

        //tim vi tri cua so 0 dau tien
        int i = arr.length - 1;
        while (true) {
            ar.printRs(arr);

                while ( i >= 0&&arr[i] == 1 ) {

                    i--;
                }

                //2 th: th1: i<0 va ta khong tim thay dc phan tu nao la 0
                //tuc la cac phan tu deu la 1 => ta dat dc cau hinh cuoi
                if(i <0 ) return ;
                //th2: ta tim thay phan tu 0
                arr[i] = 1;

                for (int j = i + 1; j < arr.length; j++) {
                    arr[j] = 0;
                }
                i = arr.length - 1;

        }
    }

    public static void main(String[] args) {
        int[] arr = new int[3];
        stNhiPhanN lk = new stNhiPhanN();
        lk.stNhiphann(arr, 3);
    }
}
