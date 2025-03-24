class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] a=new int[2];
        Map<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            m.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            if(m.containsKey(target-nums[i]) && m.get(target-nums[i])!=i){
                a[0]=i;
                a[1]=m.get(target-nums[i]);
                break;
            }
        }
        return a;
    }
}