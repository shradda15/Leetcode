class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] c=s.toCharArray();
        Set<Character> st=new HashSet<>();
        int i=0;
        int max=0;
        for (int j = 0; j < c.length; j++) {  
            while (st.contains(c[j])) {   
                st.remove(c[i]);  
                i++;  
            }  
            st.add(c[j]);
            max = Math.max(max,st.size());
        }  
        return max;
    }
}