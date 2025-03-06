class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length;
        int[] a=new int[2];
        Map<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(m.containsKey(grid[i][j])){
                    a[0]=grid[i][j];
                }
                else{
                    m.put(grid[i][j],1);
                }
            }
        }
        for(int i=1;i<=n*n;i++){
            if(!m.containsKey(i)){
                a[1]=i;
                break;
            }
        }
        return a;
    }
}