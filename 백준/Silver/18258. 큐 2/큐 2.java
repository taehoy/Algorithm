import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Deque<Integer> deque = new LinkedList<>();

        int N = Integer.parseInt(br.readLine());

        while (N-- > 0) {
            String cmd = br.readLine();

            if(cmd.startsWith("push")){
                int num = Integer.parseInt(cmd.split(" ")[1]);
                deque.addLast(num);
            } else if (cmd.startsWith("pop")) {
                if(deque.isEmpty()) sb.append("-1").append("\n");
                else sb.append(deque.isEmpty() ? "-1" : deque.pollFirst()).append("\n");
            } else if (cmd.startsWith("size")) {
                sb.append(deque.size()).append("\n");
            } else if (cmd.startsWith("empty")) {
                sb.append(deque.isEmpty() ? "1" : "0").append("\n");
            } else if (cmd.startsWith("front")) {
                sb.append(deque.isEmpty() ? "-1" : deque.peekFirst()).append("\n");
            } else if (cmd.startsWith("back")) {
                sb.append(deque.isEmpty() ? "-1" : deque.peekLast()).append("\n");
            }

        }

        System.out.println(sb);
    }
}
