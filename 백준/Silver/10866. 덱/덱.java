import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Deque<Integer> dq = new LinkedList<>();

        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        for(int i=0; i<N;i++){
            st = new StringTokenizer(br.readLine());

            String s = st.nextToken();

            switch (s){
                case "push_front" :
                    int num = Integer.parseInt(st.nextToken());
                    dq.addFirst(num);
                    break;
                case "push_back" :
                    int num1 = Integer.parseInt(st.nextToken());
                    dq.add(num1);
                    break;
                case "pop_front" :
                    sb.append(dq.isEmpty() ? -1 : dq.poll()).append("\n");
                    break;
                case "pop_back" :
                    sb.append(dq.isEmpty() ? -1 : dq.pollLast()).append("\n");
                    break;
                case "size" :
                    sb.append(dq.size()).append("\n");
                    break;
                case "empty" :
                    sb.append(dq.isEmpty() ? 1 : 0).append("\n");
                    break;
                case "front" :
                    sb.append(dq.isEmpty() ? -1 : dq.peek()).append("\n");
                    break;
                case "back" :
                    sb.append(dq.isEmpty() ? -1 : dq.peekLast()).append("\n");
                    break;
            }
        }

        System.out.println(sb);
        br.close();
    }
}
