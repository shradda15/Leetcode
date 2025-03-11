class Solution {
    public int rob(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int[] dp=new int[nums.length];
        dp[0]=nums[0];
        dp[1]=Math.max(nums[0],nums[1]);
        int p=0,np=0;
        for(int i=2;i<nums.length;i++){
            if(i-2>=0){
                p=dp[i-2]+nums[i];
            }
            np=dp[i-1]+0;
            dp[i]=Math.max(p,np);
        }
        return dp[nums.length-1];
    }
}