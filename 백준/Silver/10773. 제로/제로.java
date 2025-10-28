
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        Stack<Integer> stack = new Stack<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int K = Integer.parseInt(br.readLine());

        for (int i = 0; i < K; i++) {
            int num = Integer.parseInt(br.readLine());

            if (num == 0) {
                if(stack.isEmpty()) continue;
                else stack.pop();
            } else {
                stack.push(num);
            }
        }

        int sum = 0;
        for (Integer integer : stack) {
            sum += integer;
        }

        System.out.println(sum);
    }
}
