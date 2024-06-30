import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Queue<Integer> queue = new LinkedList<>();

        for(int i=1; i<=N; i++){
            queue.offer(i);
        }

        // quque 안에 1개 만을 때까지 돌린다.
        while(queue.size() >1){
            // 처음 꺼 버린다.
            queue.poll();

            // 두번 째꺼 뒤로 돌린다.
            queue.offer(queue.poll());
        }

        System.out.println(queue.poll());
    }
}
