import java.util.*;

class Solution
{
    public int solution(String s)
    {
        Stack<Character> stack = new Stack<>();
        
        for(int i=0; i<s.length(); i++){
            if(stack.isEmpty()){
                stack.push(s.charAt(i));
            } else {
                char ch = stack.peek();
                if(ch == s.charAt(i)){
                    stack.pop();
                } else {
                    stack.push(s.charAt(i));
                }
            }
        }
        
        return stack.isEmpty() ? 1 : 0;
    }
}