import java.util.Stack;  

class Solution {  
    public String decodeString(String s) {  
        Stack<Character> sa = new Stack<>();  
        Stack<Integer> si = new Stack<>();  
        StringBuilder sb = new StringBuilder();  
        int i = 0;  

        while (i < s.length()) {  
            char c = s.charAt(i);  
            if (Character.isDigit(c)) {  
                int num = 0;  
                while (i < s.length() && Character.isDigit(s.charAt(i))) {  
                    num = num * 10 + (s.charAt(i) - '0');  
                    i++;  
                }  
                si.push(num);  
                continue; // Skip incrementing i as it's already done in the loop  
            } else if (c == '[' || (c >= 'a' && c <= 'z')) {  
                sa.push(c);  
            } else if (c == ']') {  
                StringBuilder temp = new StringBuilder();  
                while (sa.peek() != '[') {  
                    temp.insert(0, sa.pop()); // Use insert to maintain order  
                }  
                sa.pop(); // pop the '['  
                int repeat = si.pop();  
                StringBuilder stb = new StringBuilder();  
                for (int j = 0; j < repeat; j++) {  
                    stb.append(temp);  
                }  
                for (char ch : stb.toString().toCharArray()) {  
                    sa.push(ch); // Push each character back onto the stack  
                }  
            }  
            i++;  
        }  
        
        while (!sa.isEmpty()) {  
            sb.insert(0, sa.pop()); // Build final result from the stack  
        }  

        return sb.toString();  
    }  
}