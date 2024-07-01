import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        Stack<Integer> stack = new Stack<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        // 기준숫자
        int start = 0;
        // N번 반복
        for(int i=0; i<N; i++){
            int value = Integer.parseInt(br.readLine());
            // 추가
            if(value > start){
                for(int j=start+1; j<=value; j++){
                    stack.push(j);
                    sb.append("+").append("\n");
                }
                start =value;
            }

            // 오름차순 될 수 없는 경우
            else if(stack.peek() != value){
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
