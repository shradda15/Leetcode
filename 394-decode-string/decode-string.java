import java.util.Stack;  

class Solution {  
    public String decodeString(String s) {  
        Stack<Integer> countStack = new Stack<>();  
        Stack<StringBuilder> stringStack = new Stack<>();  
        StringBuilder currentString = new StringBuilder();  
        int currentNumber = 0;  

        for (char c : s.toCharArray()) {  
            if (Character.isDigit(c)) {  
                currentNumber = currentNumber * 10 + (c - '0');  
            } else if (c == '[') {  
                countStack.push(currentNumber);  
                stringStack.push(currentString);  
                currentString = new StringBuilder();  
                currentNumber = 0;  
            } else if (c == ']') {  
                StringBuilder decodedString = new StringBuilder(stringStack.pop());  
                int repeatTimes = countStack.pop();  
                for (int j = 0; j < repeatTimes; j++) {  
                    decodedString.append(currentString);  
                }  
                currentString = decodedString;   
            } else {  
                currentString.append(c);  
            }  
        }  

        return currentString.toString();  
    }  
}