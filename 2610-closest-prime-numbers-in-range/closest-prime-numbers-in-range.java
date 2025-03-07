class Solution {
    private static boolean isPrime(int number) {  
        for (int i = 2; i <= Math.sqrt(number); i++) {  
            if (number % i == 0) {  
                return false;  
            }  
        }  
        return number > 1;  
    }
    public int[] closestPrimes(int left, int right) {
        List<Integer> l=new ArrayList<>();
        int m=Integer.MAX_VALUE;
        for(int i=left;i<=right;i++){
            if (isPrime(i)) {  
                l.add(i);
            } 
        }
        int[] a=new int[2];
        if(l.size()==0||l.size()==1){
            a[0]=-1;
            a[1]=-1;
        }
        for(int i=1;i<l.size();i++){
           if(l.get(i)-l.get(i-1)<m){
            m=l.get(i)-l.get(i-1);
            a[0]=l.get(i-1);
            a[1]=l.get(i);
           }
        }
        return a;
    }
}