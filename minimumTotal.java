class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        if(triangle.size() == 1) {
            return triangle.get(0).get(0);
        }

        ArrayList<List<Integer>> sum = new ArrayList<List<Integer>>();
        sum.add(triangle.get(triangle.size()-1));
        return seekMin(triangle, sum, triangle.size()-2);
    }

    public int seekMin(List<List<Integer>> triangle, ArrayList<List<Integer>> sum, int row) {
        if(row == 0) {
            return Math.min(sum.get(0).get(0), sum.get(0).get(1)) + triangle.get(0).get(0);
        }
        List<Integer> next = new ArrayList<Integer>();
        for(int i = 0; i <= row; i++) {
            next.add(Math.min(sum.get(0).get(i), sum.get(0).get(i+1))+triangle.get(row).get(i));
        }
        sum.add(0, next);
        return seekMin(triangle, sum, row-1);
    }
}
