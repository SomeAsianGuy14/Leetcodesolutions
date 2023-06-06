class Solution {
    public int maxArea(int[] height) {
        int out = 0;
        int i = 0;
        int j = height.length-1;
        while(j - i > 0) {
            if(Math.min(height[j], height[i]) * (j-i) > out) {
                out = Math.min(height[j], height[i]) * (j-i);
            }
            if(height[j] > height[i]) {
                i++;
            } else if(height[j] < height[i]) {
                j--;
            } else {
                i++;
                j--;
            }
        }
        return out;
    }
}
