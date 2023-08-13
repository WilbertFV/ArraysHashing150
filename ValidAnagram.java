// https://leetcode.com/problems/valid-anagram/
 
class Solution {

  public boolean isAnagram(String s, String t) {
      if (s.length() != t.length()) return false;

      int[] store = new int[26];

      for (int i = 0; i < s.length(); i++) {
          store[s.charAt(i) - 'a']++;
          store[t.charAt(i) - 'a']--;
      }

      for (int n : store) if (n != 0) return false;

      return true;
  }

public static void main(String[] args) {

    // You can call the method here if you want
    Solution solution = new Solution();
    String s = "anagram";
    String t = "nagaram";
    System.out.println("Is this an anagram?: "+ solution.isAnagram(s, t)); // Output will be true
}
}
