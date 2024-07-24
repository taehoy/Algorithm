import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        Queue<Integer> q = new LinkedList<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int lastValue = 0;

        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();

            switch (cmd){
                case "push":
                    int num = Integer.parseInt(st.nextToken());
                    q.add(num);
                    lastValue = num;
                    break;

                case "pop":
                    sb.append(q.isEmpty() ? -1 : q.poll()).append("\n");
                    break;
                case "size":
                    sb.append(q.size()).append("\n");
                    break;

                case "empty":
                    if(q.isEmpty()){
                        sb.append(1).append("\n");
                    } else {
                        sb.append(0).append("\n");
                    }
                    break;

                case "front":
                    if(q.isEmpty()){
                        sb.append(-1).append("\n");
                        break;
                    }

                    sb.append(q.peek()).append("\n");
                    break;

                case "back" :
                    if(q.isEmpty()){
                        sb.append(-1).append("\n");
                        break;
                    }

                    sb.append(lastValue).append("\n");
                    break;
            }
        }

        System.out.println(sb);
    }
}
