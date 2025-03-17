class Solution {
    public boolean divideArray(int[] nums) {
        Map<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(m.containsKey(nums[i])){
                m.put(nums[i],m.get(nums[i])+1);
            }
            else{
                m.put(nums[i],1);
            }
        }
        for(int i:m.keySet()){
            if(m.get(i)%2!=0){
                return false;
            }
        }
        return true;
    }
}