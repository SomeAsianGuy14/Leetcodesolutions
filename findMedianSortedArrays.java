class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merge = new int[nums1.length + nums2.length];
        int num1 = 0;
        int num2 = 0;
        if(nums1.length == 0) {
            if(nums2.length%2 == 0) {
            return (nums2[nums2.length/2] + nums2[(nums2.length/2)-1]) / 2.0;
            }
            return (double) nums2[nums2.length/2];
        }
        if(nums2.length == 0) {
            if(nums1.length%2 == 0) {
            return (nums1[nums1.length/2] + nums1[(nums1.length/2)-1]) / 2.0;
            }
            return (double) nums1[nums1.length/2];
        }
        for(int i = 0; i < merge.length; i++) {
            if(nums1[num1] < nums2[num2]) {
                merge[i] = nums1[num1];
                num1++;
            } else {
                merge[i] = nums2[num2];
                num2++;
            }
            if(num1 == nums1.length) {
                i++;
                for(int j = num2; j < nums2.length; j++) {
                    merge[i] = nums2[j];
                    i++;
                }
                break;
            }
            if(num2 == nums2.length) {
                i++;
                for(int j = num1; j < nums1.length; j++) {
                    merge[i] = nums1[j];
                    i++;
                }
                break;
            }
        }
        if(merge.length%2 == 0) {
            return (merge[merge.length/2] + merge[(merge.length/2)-1]) / 2.0;
        }
        return (double) merge[merge.length/2];
    }
}
