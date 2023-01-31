class Solution {
    public List<Boolean> camelMatch(String[] queries, String pattern) {
        List<Boolean> out = new ArrayList<>();
        String cur = "";
        for(String x : queries) {
            for(int i = 0; i < x.length(); i++) {
                if(x.charAt(i) - 97 < 0 || pattern.indexOf((cur+x.charAt(i))) == 0) {
                    cur += x.charAt(i);
                }
            }
            if(cur.equals(pattern)) {
                out.add(true);
            } else {
                out.add(false);
            }
            cur = "";
        }
        return out;
    }
}
