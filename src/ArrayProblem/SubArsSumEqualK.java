package ArrayProblem;

public class SubArsSumEqualK {

    public int subarraySum(int[] nums, int k) {
        //khong qua dc test case 00
        int sum = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == k) {
                count++;
                continue;
            } else {
                sum = nums[i];
            }

            for (int j = i + 1; j < nums.length; j++) {

                sum += nums[j];
                if (sum == k) {

                    count++;

                }
            }
        }


        return count;
    }

    public int goodBrutefored(int[] nums, int k) {
        int count = 0;
        for (int start = 0; start < nums.length; start++) {
            for (int end = start + 1; end <= nums.length; end++) {
                int sum = 0;
                for (int i = start; i < end; i++)
                    sum += nums[i];

                if (sum == k)
                    count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {0, 0};
        SubArsSumEqualK obj = new SubArsSumEqualK();
        System.out.println(obj.goodBrutefored(arr, 0));
    }
}
