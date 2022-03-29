package twoPointer;

import common.ArrayUtil;

public class removemorthan2Dup {
    public static int[] removemorethan2Dup(int[] arr) {
        int len=arr.length;


        int i=1, k=2;
        while(k< len){

            if(arr[k]==arr[i]&&arr[i]==arr[i-1]){
                k++;
            }else {

                i++;
                arr[i] = arr[k];
                k++;
            }
        }

        System.out.println(i+1);
        return arr;
    }




    public static int removedup3(int []nums){
        int i=1, j=2;
        int len=nums.length;
        while(j< len){
            if(nums[i-1]==nums[i]&&nums[i]==nums[j]){
                j++;
            }else{
                i++;
                nums[i]=nums[j];
                j++;


            }

        }
        System.out.println("i la "+ i);
        return i+1;

    }



    public static void main(String[] args) {
        int[] arr = new int[]{1,1,1,2,2,3};
        removemorethan2Dup(arr);
        ArrayUtil.printIntArr(arr);

    }
}
