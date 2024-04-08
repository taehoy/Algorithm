import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        for(int i=0; i<T; i++){
            System.out.println(solved(sc.next()));
        }
    }
    
    public static String solved(String s){
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '('){
                stack.push('(');
            } else {
                if(stack.isEmpty()){
                    return "NO";                   
                }
                stack.pop();
            }
        }

        if(stack.isEmpty()){
            return "YES";
        } else {
            return "NO";
        }
    }
}