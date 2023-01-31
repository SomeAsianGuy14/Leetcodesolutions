class Solution {
    public String alphabetBoardPath(String target) {
        String out = "";
        int x = 0;
        int y = 0;
        int diff;
        boolean z = false;
        for(int i = 0; i < target.length(); i++) {
            int seekx = (target.charAt(i) - 97) % 5;
            int seeky = (target.charAt(i) - 97) / 5;
            diff = y - seeky;
            if(seeky == 5 && x != 0) {
                z = true;
                diff++;
            }
            while(diff < 0) {
                out += "D";
                diff++;
            }
            while(diff > 0) {
                out += "U";
                diff--;
            }
            diff = x -seekx;
            while(diff < 0) {
                out += "R";
                diff++;
            }
            while(diff > 0) {
                out += "L";
                diff--;
            }
            if(z) {
                out+= "D";
            }
            z = false;
            out += "!";
            x = seekx;
            y = seeky;
        }
        return out;
    }
}
