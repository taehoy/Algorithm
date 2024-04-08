import java.util.*;

class Solution
{
    public int solution(String s)
    {
        char[] ch = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        
        for(char c : ch){
            if(stack.isEmpty()){
                stack.push(c);
                continue;
            }
            if(!stack.isEmpty()){
                if(stack.peek() == c){
                    stack.pop();
                } else {
                    stack.push(c);
                }
            }
        }
        
        
        
        return stack.isEmpty() ? 1 : 0;
    }
}