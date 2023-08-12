// page for question: https://leetcode.com/problems/contains-duplicate/

var containsDuplicate = (nums) => {
  for (let right = 0; right < nums.length; right++) {/* Time O(N) */
      for (let left = 0; left < right; left++) {         /* Time O(N) */
          const isDuplicate = nums[left] === nums[right];
          if (isDuplicate) return true;
      }
  }

  return false;
}