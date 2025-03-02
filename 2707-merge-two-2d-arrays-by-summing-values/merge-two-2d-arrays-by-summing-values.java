class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        List<int[]> l=new ArrayList<>();
        int i=0;
        int j=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i][0]==nums2[j][0]){
                l.add(new int[]{nums1[i][0],nums1[i][1]+nums2[j][1]});
                i++;
                j++;
            }
            else{
                if(nums1[i][0]>nums2[j][0]){
                    l.add(new int[]{nums2[j][0],nums2[j][1]});
                    j++;
                }
                else{
                    l.add(new int[]{nums1[i][0],nums1[i][1]});
                    i++;
                }
            }
        }
        while (i < nums1.length) {  
            l.add(new int[]{nums1[i][0], nums1[i][1]});  
            i++;  
        }   
        while (j < nums2.length) {  
            l.add(new int[]{nums2[j][0], nums2[j][1]});  
            j++;  
        }  
        int[][] result = new int[l.size()][2];  
        for (int k = 0; k < l.size(); k++) {  
            result[k] = l.get(k);  
        }  
        return result; 
    }
}