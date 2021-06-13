
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0, j = i + 1; i < nums.length - 1; i++) {
            for (j = i + 1; j < nums.length; j++) {
                if (nums[j] == (target - nums[i])) {
                    break;
                }
            }
            if (j < nums.length) {
                nums = new int[]{i, j};
                break;
            }
        }
        return nums;
    }
}
