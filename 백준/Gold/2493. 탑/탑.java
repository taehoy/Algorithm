import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        Stack<int[]> stack = new Stack<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        // 스택 초기화
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=1; i<=N; i++){
            int height = Integer.parseInt(st.nextToken());

            while(!stack.isEmpty()){
                if(stack.peek()[1] >= height){
                    sb.append(stack.peek()[0]).append(" ");
                    break;
                }
                stack.pop();
            }
            if(stack.isEmpty()){
                sb.append("0 ");
            }
            stack.push(new int[]{i, height});
        }

        System.out.println(sb);
    }
}
