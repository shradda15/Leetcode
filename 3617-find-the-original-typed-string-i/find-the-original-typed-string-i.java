class Solution {
    public int possibleStringCount(String word) {
        int s=0;
        int i=0,j=1;
        while(j<word.length()){
            if(word.charAt(i)!=word.charAt(j)){
                i=j;
                j++;
            }
            else{
                s=s+1;
                j++;
            }
        }
        s++;
        return s;
    }
}