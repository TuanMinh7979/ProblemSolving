package HashMap;

import common.ArrayUtil;

import java.util.HashMap;

public class twoSum {
    private static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return new int[]{map.get(nums[i]), i};
            } else {
                map.put(target - nums[i], i);
            }
        }
        return new int[]{0, 0};
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 6, 7, 8, 9};
        //target =7
        int []rs= twoSum(arr, 7);
        ArrayUtil.printIntArr(rs);

    }
}
