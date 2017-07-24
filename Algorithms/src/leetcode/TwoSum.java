package leetcode;

import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by mayur on 24-07-2017.
 */
public class TwoSum {

    public static void main(String[] args) {
        TwoSum t = new TwoSum();
        int[] a = {2, 7, 11, 15};
        int b = 9;
        System.out.println(t.twoSum(a, b)[1] + " ");
    }

    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        int index = 0;
        HashMap<Integer, Integer> lookingFor = new HashMap<>();
        for (int num : nums) {
            if (lookingFor.containsKey(num)) {
                ans[0] = lookingFor.get(num);
                ans[1] = index;
                break;
            }
            lookingFor.put(target - num, index++);
        }
        return ans;
    }

}
