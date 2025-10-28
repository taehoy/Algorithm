

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        Stack<Integer> stack = new Stack<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 1. 입력
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String command = st.nextToken();

            if (command.equals("push") ) {
                int n = Integer.parseInt(st.nextToken());
                stack.push(n);
            } else if (command.equals("pop")) {
                if(stack.isEmpty()) sb.append("-1").append("\n");
                else sb.append(stack.pop()).append("\n");
            } else if (command.equals("size")) {
                sb.append(stack.size()).append("\n");
            } else if (command.equals("empty")) {
                if(stack.isEmpty()) sb.append("1").append("\n");
                else sb.append("0").append("\n");
            } else if (command.equals("top")) {
                if(stack.isEmpty()) sb.append("-1").append("\n");
                else sb.append(stack.peek()).append("\n");
            }
        }

        System.out.println(sb);

        // push면 분리해서 숫자 넣기
        //

    }
}
