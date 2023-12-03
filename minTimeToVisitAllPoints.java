class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int out = 0;
        int x = points[0][0];
        int y = points[0][1];
        for(int i = 1; i < points.length; i++) { 
            out += Math.max(Math.abs(x - points[i][0]), Math.abs(y - points[i][1]));
            x = points[i][0];
            y = points[i][1];
        }
        return out;
    }
}
