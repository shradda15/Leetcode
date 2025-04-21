class Solution {
    public int maxArea(int[] height) {
        int i=0,j=height.length-1;
        int a=Integer.MIN_VALUE;
        while(i<j){
            int h=Math.min(height[i],height[j]);
            a=Math.max(a,(j-i)*h);
            if(height[i]<=height[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return a;
    }
}