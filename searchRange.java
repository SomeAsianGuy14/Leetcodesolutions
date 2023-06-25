class Solution {
    public int[] searchRange(int[]nums, int target) {
        int[] out = {-1,-1};
	    out[0]=search(nums,target,true);
	
        if(out[0]!=-1) {
	        out[1]=search(nums,target,false);
	    }
	    return out;
    }
  
	
	int search(int[] nums,int target,boolean down) {
	    int out=-1;
	    int left=0;
	    int right= nums.length-1;
	    while(left<=right) {
		    int mid = left+(right-left)/2;
		    if(target < nums[mid]) {
			    right= mid-1;
    		} else if(target > nums[mid]) {
	    		left = mid+1;
		    }
		    else {
			    out = mid;
			    if(down) {
				    right = mid-1;
			    }
			    else {
				    left = mid+1;
			    }
            }
        }
        return out;
    }
}
