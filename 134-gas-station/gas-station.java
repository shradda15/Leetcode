class Solution {  
    public int canCompleteCircuit(int[] gas, int[] cost) {  
        int total = 0, tank = 0, start = 0;  
        for (int i = 0; i < gas.length; i++) {  
            int diff = gas[i] - cost[i];  
            total += diff;  
            tank += diff;  
            
            // If tank is negative, start from next station  
            if (tank < 0) {  
                start = i + 1;  
                tank = 0;  
            }  
        }  
        
        return total >= 0 ? start : -1;  
    }  
}  