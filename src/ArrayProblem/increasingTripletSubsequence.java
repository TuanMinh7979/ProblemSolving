package ArrayProblem;

public class increasingTripletSubsequence {
    public boolean increasingTriplet(int[] nums) {
        int x = Integer.MAX_VALUE;
        int y = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int z = nums[i];
            if (x >= z) {
                x = z;// update x to be a smaller value
            } else if (y >= z) {
                y = z; // update y to be a smaller value
            } else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr={2,1,5,0,4,6};
        increasingTripletSubsequence ins= new increasingTripletSubsequence();
        System.out.println(ins.increasingTriplet(arr));
    }


}
