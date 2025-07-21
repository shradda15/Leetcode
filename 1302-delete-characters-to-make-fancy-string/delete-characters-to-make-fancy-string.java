class Solution {
    public String makeFancyString(String s) {
        StringBuilder sb=new StringBuilder();
        int i=0, j=1,c=0;
        while(j<s.length()){
            if(s.charAt(i)!=s.charAt(j)){
                sb.append(s.charAt(i));
                if(c>=1){
                    sb.append(s.charAt(i));
                }
                i=j;
                // System.out.println(i);
                j++;
                c=0;
            }
            else{
                j++;
                c++;
            }
        }
        if(s.length()-1-i>=1){
            sb.append(s.charAt(i));
            sb.append(s.charAt(i));
        }
        else{
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}