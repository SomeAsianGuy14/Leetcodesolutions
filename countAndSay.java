class Solution {
    public String countAndSay(int n) {
        return countAndSay("1", n);
    }

    public String countAndSay(String count, int n) {
        if(n == 1) {
            return count;
        }
        n--;
        String out = "";
        String num = count.substring(0,1);
        int q = 0;
        for(int i = 0; i < count.length(); i++) {
            if(num.equals(count.substring(i, i+1))) {
                q++;
            } else {
                out = out + q + num;
                num = count.substring(i, i+1);
                q = 1;
            }
        }
        out = out + q + num;
        return countAndSay(out, n);
    }
}
