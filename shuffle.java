class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] out = new int[nums.length];
        for(int i = 0; i < n; i++) {
            out[i*2] = nums[i];
            out[i*2+1] = nums[i + n];
        }
        return out;
    }
}
