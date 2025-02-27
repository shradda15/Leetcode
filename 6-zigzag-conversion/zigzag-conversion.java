class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) return s;
        StringBuilder[] a = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {  
            a[i] = new StringBuilder();
        }
        int j = 0;
        int i = 0;
        while (i < s.length()) {
            if (j == numRows - 1) {
                while (j > 0 && i < s.length()) {
                    a[j].append(s.charAt(i));
                    j--;
                    i++;
                }
            }
            if (j == 0) {
                while (j < numRows - 1 && i < s.length()) {
                    a[j].append(s.charAt(i));
                    j++;
                    i++;
                }
            }
        }
        for (int k = 1; k < a.length; k++) {
            a[0].append(a[k]);
        }
        return a[0].toString();
    }
}