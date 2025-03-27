class Solution {
    public int findMin(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int i=0,j=nums.length-1;
        int m=Integer.MAX_VALUE;
        while(i<j){
            int mid=(i+j)/2;
            if(nums[mid]>=nums[j]){
                i=mid+1;
            }
            else{
                j=mid;
            }
        }
        return nums[i];
    }
}