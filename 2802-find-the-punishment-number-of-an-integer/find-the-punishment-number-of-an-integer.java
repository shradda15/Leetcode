class Solution {  
    public int punishmentNumber(int n) {  
        int sum = 0;  
        for (int i = 1; i <= n; i++) {  
            int x = i * i;  
            if (partition(x, i)) {  
                sum += x;  
            }  
        }  
        return sum;  
    }  
    
    private boolean partition(int x, int target) {  
        if (x == target) return true;  
        if (x == 0) return target == 0;  
        for (int m = 10; m <= 1000; m *= 10) {  
            if (partition(x / m, target - (x % m))) {  
                return true;  
            }  
        }  
        return false;  
    }  
}