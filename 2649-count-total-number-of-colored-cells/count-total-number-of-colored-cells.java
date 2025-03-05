class Solution {
    public long coloredCells(int n) {
        if(n==1){
            return 1;
        }
        int k=1;
        long sum=k*2;
        for(int i=1;i<n;i++){
            if(i==n-1){
                k=k+2;
                sum=sum+k;
            }
            else{
                k=k+2;
                sum=sum+(k*2);
            }
        }
        return sum;
    }
}