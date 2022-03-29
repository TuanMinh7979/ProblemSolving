package Sort;

public class BinarySeacrh {
    public static int binarySearch(int [] nums, int target){
//       int right= nums.length-1;
//
//       int left=0;
//
//       while(left<=right){
//           int pivot=left + (right-left)/2;
//
//           if(nums[pivot]==target){
//               return pivot;
//           }else if(target<nums[pivot]){
//               right= pivot -1;
//
//
//           }else{
//               left = pivot+1;
//
//           }
//
//       }

   int len= nums.length;
   int left=0;
   int right =len-1;//last index of arr
        //While all so a condition
        while(left < right){
            int piv= (left + right)/2;
            if(target==nums[piv]){
                return piv;
            }else if(target > nums[piv]){
                left =piv +1;

            }else{
                right =piv -1;
            }

        }
        return -1;

    }

    //worse case : khi phan tu can tim o cuoi mang hoac dau mang
    //=> n / 2^k =1(k la so luot tim kiem)
    //hay n = 2^k hoac c^k +-1

    //=> log2 n= k log2 2
    //=> k= log n
    public static void main(String[] args) {
        int[] arr={1,3,5,7,9,11,13,15};
        System.out.println(BinarySeacrh.binarySearch(arr,18));



    }
}
