/**
 * Problem: Two Sum
 * Link: https://leetcode.com/problems/two-sum/
 *
 * Approach:
 * - Use a HashMap to store numbers and their indices as we iterate
 * - For each number, calculate x = target - current number
 * - If x exists in the map, return indices [map.get(x), i]
 * - Otherwise, put current number in the map
 *
 * Time Complexity: O(n) -> we iterate through the array once
 * Space Complexity: O(n) -> HashMap stores at most n elements
 */

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int cur = nums[i];
            int x = target - cur;
            if(map.containsKey(x)) {
                return new int[] {map.get(x), i};
            }
            map.put(cur, i);
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = solution.twoSum(nums, target);
        for (int index : result) {
            System.out.print(index + " ");
        }
    }
}
