class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int out = 0;
        Arrays.sort(costs);
        for(int x : costs) {
            if(x <= coins) {
                coins -= x;
                out++;
            } else {
                return out;
            }
        }
        return out;
    }
}
