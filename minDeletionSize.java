class Solution {
    public int minDeletionSize(String[] strs) {
        int out = 0;
        for(int i = 0; i < strs[0].length(); i++) {
            for(int j = 0; j < strs.length-1; j++) {
                if(strs[j].substring(i, i+1).compareTo(strs[j+1].substring(i,i+1)) > 0) {
                    out++;
                    break;
                }
            }
        }
        return out;
    }
}
