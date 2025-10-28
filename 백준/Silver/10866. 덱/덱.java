

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        // 덱생성
        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine(), " ");
            String cmd = st.nextToken();

            switch (cmd) {
                case "push_back":
                    int num = Integer.parseInt(st.nextToken());
                    deque.offerLast(num);
                    break;
                case "push_front":
                    int num1 = Integer.parseInt(st.nextToken());
                    deque.offerFirst(num1);
                    break;
                case "pop_front":
                    sb.append(deque.isEmpty() ? -1 : deque.pollFirst()).append("\n");
                    break;
                case "pop_back":
                    sb.append(deque.isEmpty() ? -1 : deque.pollLast()).append("\n");
                    break;
                case "size":
                    sb.append(deque.size()).append("\n");
                    break;
                case "empty":
                    sb.append(deque.isEmpty() ? 1 : 0).append("\n");
                    break;
                case "front":
                    sb.append(deque.isEmpty() ? -1 : deque.peekFirst()).append("\n");
                    break;
                case "back":
                    sb.append(deque.isEmpty() ? -1 : deque.peekLast()).append("\n");
                    break;
            }
        }

        System.out.println(sb);
        br.close();
    }
}
