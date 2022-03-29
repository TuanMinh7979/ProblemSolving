package LinkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class intersectionOf2arr {
    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        for (int i : nums1) {
            set1.add(i);

        }
        for (int si : set1){
            System.out.print(si+" ");
        }

        HashSet<Integer> set2 = new HashSet<>();
        for (int j : nums2) {
            if (set1.contains(j)) {
                set2.add(j);

            }
        }
        int[] rs = new int[set2.size()];
        int i = 0;
        for (int k : set2) {
            rs[i++] = k;
        }
        return rs;

    }

    public static int[] intersection1(int[] nums1, int[] nums2) {
        //cach nay la nhanh nhat
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < nums1.length; i++) {
            if (i == 0 || (i > 0 && nums1[i] != nums1[i - 1])) {
                if (Arrays.binarySearch(nums2, nums1[i]) > -1) {
                    list.add(nums1[i]);
                }
            }
        }
        int[] rs = new int[list.size()];
        int k = 0;
        for (int i : list) {
            rs[k++] = i;
        }
        return rs;

    }

    public static int[] intersection2(int[] nums1, int[] nums2) {
        //sort array and use 2p
        Set<Integer> set = new HashSet<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0, j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] > nums2[j]) {
                j++;

            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                set.add(nums1[i]);
                i++;
                j++;
            }
        }
        int [] rs= new int[set.size()];
        int k=0;
        for(int num: set){
            rs[k++]=num;

        }
        return rs;

    }
    public static int[] intersectII(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0, j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] > nums2[j]) {
                j++;

            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                list.add(nums1[i]);
                i++;
                j++;
            }


        }
        int [] rs= new int[list.size()];
        int k=0;
        for(int num: list){
            rs[k++]=num;

        }
        return rs;
    }

    public static void main(String[] args) {
        //compare speed
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2,2};

        double startTime = System.nanoTime();
        //thuat toan
        int[] rs = intersectII(nums1, nums2);
        double endTime = System.nanoTime();
        double exetime = (endTime - startTime) / 1000000000;
        System.out.println("TIME EXECUTE: " + exetime);
        for (int i : rs) {
            System.out.println(i);
        }


    }
}
