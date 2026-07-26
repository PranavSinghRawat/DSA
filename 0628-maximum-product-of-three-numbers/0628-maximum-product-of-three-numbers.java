import java.util.Arrays;

class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;

        // Case 1: Three largest numbers
        int max1 = nums[n - 1] * nums[n - 2] * nums[n - 3];

        // Case 2: Two smallest (could be negative) and the largest number
        int max2 = nums[0] * nums[1] * nums[n - 1];

        return Math.max(max1, max2);
    }
}
