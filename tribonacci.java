class Solution {
    public int tribonacci(int n) {
        if(n == 0) {
            return 0;
        }
        if(n < 3) {
            return 1;
        }
        return tribonacci(0, 1, 1, n-3);
    }

    public int tribonacci(int n1, int n2, int n3, int i) {
        int cur = n1 + n2 + n3;
        if(i <= 0) {
            return cur;
        }
        return tribonacci(n2, n3, cur, i-1);
    }
}
