class Solution {
    public long countOfSubstrings(String word, int k) {
        return fun(word,k)-fun(word,k+1);
    }
    public long fun(String word,int k){
        int i=0;
        long cnt=0;
        int cc=0;
        Map<Character,Integer> m=new HashMap<>();
        for(int j=0;j<word.length();j++){
            char ch=word.charAt(j);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                if(m.containsKey(ch)){
                    m.put(ch,m.get(ch)+1);
                }
                else{
                    m.put(ch,1);
                }
            }
            else{
                cc++;
            }
            while((m.size() == 5 && cc >= k)) {
                cnt=cnt+word.length()-j;
                char startChar = word.charAt(i);
                if (startChar == 'a' || startChar == 'e' || startChar == 'i' || startChar == 'o' || startChar == 'u') {
                    m.put(startChar, m.get(startChar) - 1);
                    if (m.get(startChar) == 0) {
                        m.remove(startChar);
                    }
                }
                else{
                    cc--;
                }
                i++;
            }
        }
        return cnt;
    }
}