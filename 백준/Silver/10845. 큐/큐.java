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

        Deque<Integer> q = new LinkedList<>();

        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());

            String s = st.nextToken();

            if(s.equals("push")){
                int num = Integer.parseInt(st.nextToken());
                q.add(num);
            } else if(s.equals("pop")){
                sb.append(q.isEmpty() ? -1 : q.poll()).append("\n");
            } else if(s.equals("size")){
                sb.append(q.size()).append("\n");
            } else if(s.equals("empty")){
                sb.append(q.isEmpty() ? 1 : 0).append("\n");
            } else if(s.equals("front")){
                sb.append(q.isEmpty() ? -1 : q.peek()).append("\n");
            } else if(s.equals("back")){
                sb.append(q.isEmpty() ? -1 : q.peekLast()).append("\n");
            }
        }

        System.out.println(sb);

        br.close();
    }
}
