class Solution {
    public List<Integer> intersection(int[][] nums) {
        List<Integer> l=new ArrayList<>();
        Map<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                if(m.containsKey(nums[i][j])){
                    m.put(nums[i][j],m.get(nums[i][j])+1);
                }
                else{
                    m.put(nums[i][j],1);
                }
            }
        }
        for(int i:m.keySet()){
            if(m.get(i)==nums.length){
                l.add(i);
            }
        }
        Collections.sort(l);
        return l;
    }
}