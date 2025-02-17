class Solution {
    public int numTilePossibilities(String tiles) {
        Set<String> l=new HashSet<>();
        StringBuilder s=new StringBuilder();
        int[] v=new int[tiles.length()];
        for(int i=0;i<tiles.length();i++){
            v[i]=0;
        }
        bt(l,s,tiles,v);
        return l.size();
    }
    public void bt(Set<String> l,StringBuilder s,String tiles,int[] v){
        if(s.length()>0){
            l.add(s.toString());
        }
        for(int i=0;i<tiles.length();i++){
            if(v[i]==1){
                continue;
            }
            s.append(tiles.charAt(i));
            v[i]=1;
            bt(l,s,tiles,v);
            s.deleteCharAt(s.length() - 1);
            v[i]=0;
        }
    }
}