package other;

import common.ArrayUtil;

public class moveZeros {


    public static void moveZeroes(int[] nums) {
        int len = nums.length;
        int m = 0;

        for (int i = 0; i < len; i++) {
            if (nums[i] != 0) {
                //check truong hop co kha nang xay ra nhieu nhat len dau
                nums[m] = nums[i];
                m++;
            }
        }
//        System.out.println("m la"+m);

        for (int j = m; j <len;j++) {
            nums[j] = 0;
        }

    }

    public static void moveZeroes1(int[] nums) {
        //cham nhung lau
        int len = nums.length;
        int temp = -1;
        int m = 0;
        int i = 0;
        while (i < len) {
            if (nums[i] != 0) {
                    temp=nums[m];
                    nums[m] = nums[i];
                    nums[i] = temp;
                    m++;
            }
            i++;
        }


    }
    public static void moveZero2(int [] nums) {
        //nhanh nhung hoi dai
        int i = 0;
        int j = 0;
        while (j < nums.length) {
            if (nums[j] == 0) {
                j++;
            } else {
                nums[i] = nums[j];
                i++;
                j++;
            }
        }
        while (i < nums.length) {
            nums[i] = 0;
            i++;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 0, 7, 0, 0, 0, 12, 0, 13, 14, 0, 15};
        moveZeroes(arr);
        ArrayUtil.printIntArr(arr);
        System.out.println(" phan tu dau tien" + arr[0]);
    }
}
