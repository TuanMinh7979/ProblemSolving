package twoPointer;

import common.ArrayUtil;

public class removeEle {
    public static int remove(int[] nums, int val){
        int m=0, j=0;
        int len=nums.length;
        while(j<len){
            if(nums[j]!= val){
                nums[m]=nums[j];
                m++;

            }else{
                System.out.println("vao else");
            }
                System.out.println("vao day");
                j++;

        }
        return m;
    }


    public static void main(String[] args) {
        int [] arr={3,3,3,26,1,2,3,3,9};
        remove(arr, 3);

        ArrayUtil.printIntArr(arr);

    }

}
