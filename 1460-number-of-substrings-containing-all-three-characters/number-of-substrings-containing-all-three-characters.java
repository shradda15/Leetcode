class Solution {
    public int numberOfSubstrings(String s) {
        int i=0;
        int cnt=0;
        Map<Character,Integer> m=new HashMap<>();
        for(int j=0;j<s.length();j++){
            char ch=s.charAt(j);
            if(m.containsKey(ch)){
                m.put(ch,m.get(ch)+1);
            }
            else{
                m.put(ch,1);
            }
            while(m.size()==3){
                cnt=cnt+s.length()-j;
                if(m.get(s.charAt(i))>1){
                    m.put(s.charAt(i),m.get(s.charAt(i))-1);
                }
                else{
                    m.remove(s.charAt(i));
                }
                i++;
            }
        }
        return cnt;
    }
}