import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        Stack<Integer> stack = new Stack<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N =Integer.parseInt(br.readLine());

        int start = 0;

        // N번 반복
        for(int i=0; i<N; i++){
            int num = Integer.parseInt(br.readLine());
            // 추가
            if(num > start){
                for(int j= start+1; j<=num; j++){
                    stack.push(j);
                    sb.append('+').append("\n");
                }
                start = num;
            }


            // 크기 비교
            else if(stack.peek() > num){
                System.out.println("NO");
                return;
            }
            // 제거

            stack.pop();
            sb.append("-").append("\n");
        }

        System.out.println(sb);
    }
}
