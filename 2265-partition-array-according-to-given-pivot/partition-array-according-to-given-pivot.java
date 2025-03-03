class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> l=new ArrayList<>();
        List<Integer> g=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]<pivot){
                l.add(nums[i]);
            }
            else if(nums[i]>pivot){
                g.add(nums[i]);
            }
        }
        int i=0;
        while(i<l.size()){
            nums[i]=l.get(i);
            i++;
        }
        int j=nums.length-1;
        for(int k=g.size()-1;k>=0;k--){
            nums[j]=g.get(k);
            j--;
        }
        while(i<=j){
            nums[i]=pivot;
            i++;
        }
        return nums;
    }
}