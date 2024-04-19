import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int i=0; i<T; i++){
            System.out.println(solution(br.readLine(), br));
        }

    }

    private static String solution(String str, BufferedReader br) throws IOException {
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == '('){
                stack.push('(');
            } else {
                if(stack.isEmpty()){
                    return "NO";
                }
                stack.pop();
            }
        }

        if(!stack.isEmpty()){
            return "NO";
        }

        return "YES";

    }
}
