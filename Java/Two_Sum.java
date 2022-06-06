package Java;

import java.util.HashMap;

public class Two_Sum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.get(target - nums[i]) != null) {
                return new int[] { map.get(target - nums[i]), i };
            }
            map.put(nums[i], i);
        }
        return new int[] { 0, 0 };
    }
}