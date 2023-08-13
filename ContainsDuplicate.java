// page for question: https://leetcode.com/problems/contains-duplicate/

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

  public boolean containsDuplicate(int[] nums) {
      Set<Integer> uniques = new HashSet<>();
      for (int i = 0; i < nums.length; i++) {
          if (uniques.contains(nums[i])) {
              return true;
          }
          uniques.add(nums[i]);
      }
      return false;
  }


public static void main(String[] args) {

    // You can call the method here if you want
    ContainsDuplicate solution = new ContainsDuplicate();
    int[] nums = {1, 2, 3, 4, 2 };
    System.out.println("Does this set contain a dulplicate?: "+ solution.containsDuplicate(nums)); // Output will be true
}
}