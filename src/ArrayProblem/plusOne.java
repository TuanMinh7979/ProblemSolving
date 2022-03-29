package ArrayProblem;

import common.ArrayUtil;

public class plusOne {
    private static int[] plus(int []nums){
        int i=nums.length-1;
        while(i>=0){
            if(nums[i]+1<10){
                nums[i]+=1;
                return nums;
            }else{
                nums[i]=0;
                i--;
            }

        }
        if(i<0){
            int[] num2= new int[nums.length+1];
            for(int j=1; j<num2.length; j++){
                num2[j]=nums[j-1];
            }
            num2[0]=1;
            nums= num2;
        }
        return nums;

    }

    public static void main(String[] args) {
        int []di= {1,2,8};
        ArrayUtil.printIntArr(plus(di));

    }
}
