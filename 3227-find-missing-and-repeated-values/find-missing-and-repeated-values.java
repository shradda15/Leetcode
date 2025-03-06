class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length;
        int[] a=new int[2];
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(l.contains(grid[i][j])){
                    a[0]=grid[i][j];
                }
                else{
                    l.add(grid[i][j]);
                }
            }
        }
        Collections.sort(l);
        System.out.print(l);
        for(int i=1;i<=n*n;i++){
            if (!l.contains(i)) {  
                a[1] = i;  
                break;  
            } 
        }
        return a;
    }
}