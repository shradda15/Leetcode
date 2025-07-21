class Solution {
    public int findLucky(int[] arr) {
        Map<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(m.containsKey(arr[i])){
                m.put(arr[i],m.get(arr[i])+1);
            }
            else{
                m.put(arr[i],1);
            }
        }
        int ma=Integer.MIN_VALUE;
        for(int i:m.keySet()){
            if(i==m.get(i)){
                ma=Math.max(i,ma);
            }
        }
        return ma==Integer.MIN_VALUE?-1:ma;
    }
}