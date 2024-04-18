import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static String solution(String s, BufferedReader br) throws IOException {
        String answer = "";
        // 문자열을 배열로 전황한다.
        String[] arr = s.split("");
        // 스택을 만든다.
        Stack<String> stack = new Stack<>();
        // 문자열 배열 순회한다.
        for(int j=0; j<arr.length; j++){
            // (면 push
            if(arr[j].equals("(")){
                stack.push("(");
            } else {
                // )이고 비어있다면 "NO출력후 break
                if(stack.isEmpty()){
                    answer = "NO";
                    return answer;
                } else {
                    // )이고 안비어있으면 pop
                    stack.pop();
                }
            }
        }

        if(!stack.isEmpty()) return "NO";

        return "YES";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        // T테스트케이스 순회
        for(int i=0; i<T; i++){
            System.out.println(solution(br.readLine(), br));
        }
    }
}
