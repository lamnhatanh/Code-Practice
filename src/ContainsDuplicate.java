import java.util.*;

public class ContainsDuplicate {
    public static void main(String[] args) {
        /*Given an integer array nums,
        return true if any value appears at least twice in the array,
        and return false if every element is distinct.*/
//        Input: nums = [1,2,3,1]
//        Output: true
        int[] arrInput = new int[]{1,2,3,4};
        System.out.println((containsDuplicate(arrInput)));
    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> hs = new HashSet<>();
        for (int i=0; i<nums.length; i++) {
            if (hs.contains(nums[i])) {
                return true;
            }
            hs.add(nums[i]);
        }
        return false;
    }
}
