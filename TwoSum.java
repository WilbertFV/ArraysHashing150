import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
  class Solution {

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> prevMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int diff = target - num;

            if (prevMap.containsKey(diff)) {
                return new int[] { prevMap.get(diff), i };
            }

            prevMap.put(num, i);
        }

        return new int[] {};
    }
  }

  public static void main(String[] args) {
        TwoSum twoSum = new TwoSum(); // Create an instance of the enclosing class
        Solution solution = twoSum.new Solution(); // Create an instance of the inner class through the enclosing class instance
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = solution.twoSum(nums, target);

        System.out.println("Indices of the two numbers that add up to the target: " + Arrays.toString(result)); // Output will be [0, 1]
    }
}



