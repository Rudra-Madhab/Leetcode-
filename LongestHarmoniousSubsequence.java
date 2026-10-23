
import java.util.Arrays;

class Solution {
    public int findLHS(int[] nums) {
        int n = nums.length;
        int res = 0;
        int l = 0, r = 1;

        Arrays.sort(nums);

        while (r < n) {
            while (nums[r] - nums[l] > 1) {
                l++;
            }

            if (nums[r] - nums[l] == 1) {
                res = Math.max(res, r - l + 1);
            }

            r++;
        }

        return res;
    }
}
