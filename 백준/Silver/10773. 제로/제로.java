import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        Stack<Integer> stack = new Stack<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for(int i=0; i<N; i++){
            String s = br.readLine();

            if(s.equals("0")){
                // 스택 비어있으면 continue
                if(stack.isEmpty()) continue;
                else {
                    stack.pop();
                }
            } else {
                int n = Integer.parseInt(s);
                stack.push(n);
            }
        }

        int sum = 0;

        // 스택이 비어있으면 0 출력
        if(stack.isEmpty()) System.out.println(sum);
        else{
            while(!stack.isEmpty()){
                sum += stack.pop();
            }
            System.out.println(sum);
        }
    }
}
