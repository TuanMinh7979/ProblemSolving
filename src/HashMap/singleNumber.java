package HashMap;

import java.util.HashMap;
import java.util.Map;

public class singleNumber {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int num : nums) {
            if (hm.containsKey(num)) {
                hm.put(num, 2);
            } else {
                hm.put(num, 1);
            }

        }
        for(Map.Entry<Integer, Integer> a: hm.entrySet()){
            if(a.getValue()==1) return a.getKey();
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr= {3,5,2,5,2};
        singleNumber obj= new singleNumber();
        System.out.println(obj.singleNumber(arr));
    }
}
