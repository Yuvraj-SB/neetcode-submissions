class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int[] res = new int[nums1.length + nums2.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<=nums2[j]){
                res[k++]=nums1[i++];
            }
            else{
                res[k++]=nums2[j++];
            }
        }
        if(j<nums2.length){
            while(j<nums2.length){
                res[k++]=nums2[j++];
            }
        }
        else{
            while(i<nums1.length){
                res[k++]=nums1[i++];
            }
        }
        if(res.length % 2 != 0){
            return (double)res[(res.length-1)/2];
        }
        
        int sum = res[(res.length-1)/2] + res[(res.length-1)/2 +1];
        return (double)sum/2;
    }
}
