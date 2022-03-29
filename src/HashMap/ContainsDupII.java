package HashMap;

import java.util.HashMap;

public class
ContainsDupII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                int pre = map.get(nums[i]);
                if(i-pre<=k)
                    return true;
            }
            //ong o tren co dung nhung khong return thi ta cung them
            //ong o tren co dung va return thi dong nay khong co y nghia
            map.put(nums[i], i);
        }
        return false;
    }

    public boolean containsNearbyDuplicateF(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                int pre = map.get(nums[i]);
                if(i-pre<=k)
                    return true;
            }
           else {
               //chi khi ong tren return false
                map.put(nums[i], i);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int []arr= {1,0,1,1};
        int k=1;
        ContainsDupII ins= new ContainsDupII();
        ins.containsNearbyDuplicate(arr, k);

    }

}
