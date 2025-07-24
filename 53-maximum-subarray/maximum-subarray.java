class Solution {
    public int maxSubArray(int[] nums) {
        int m=Integer.MIN_VALUE;
        int s=0;
        for(int i:nums){
            s=s+i;
            if(s>m){
                m=s;
            }
            if(s<0){
                s=0;
            }
        }
        return m;
    }
}