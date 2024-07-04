import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class Main {
    private static StringBuilder sb = new StringBuilder();


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            String s = br.readLine();
            // '.'이면 break;
            if(s.equals(".")) break;

            // ( ) [ ] 매칭 확인
            sb.append(solution(s)).append("\n");

        }

        System.out.println(sb);
    }

    private static String solution(String s) {
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);

            // ( ) 확인
            if(c == '(' || c == '['){
                stack.push(c);
            } else if (c == ')'){
                if(stack.isEmpty() || stack.peek() != '('){
                    return "no";
                } else {
                    stack.pop();
                }

            } else if (c == ']') {

                if(stack.isEmpty() || stack.peek() != '['){
                    return "no";
                } else {
                    stack.pop();
                }
            }
        }

        // 3. 비어있는지 화인
        if(stack.isEmpty()){
            return "yes";
        } else {
            return "no";
        }
    }

    private static boolean isIncludeChar(String s) {
        // ( ) [ ] 포함 여부 확인
        if(!(s.contains("(") || s.contains(")") || s.contains("[") || s.contains("]"))){
            sb.append("yes").append("\n");
            return false;
        }

        return true;
    }
}
