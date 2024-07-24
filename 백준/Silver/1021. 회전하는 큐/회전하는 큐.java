import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        LinkedList<Integer> deque = new LinkedList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 큐의 길이
        int T = Integer.parseInt(st.nextToken()); // 뽑을 요소 개수
        int cnt = 0;

        for(int i=1; i<=N; i++){
            deque.addLast(i);
        }

        int[] seq = new int[T];

        st = new StringTokenizer(br.readLine());

        for(int i=0; i<T; i++){
            seq[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=0; i<T; i++){
            int targetIdx = deque.indexOf(seq[i]);// 순서
            int halfIdx; // 가운데 인덱스

            // 가운데 인덱스 구하기-> 덱의 크기가 짝수면 -1, 홀수면 그대로
            if(deque.size() %2 == 0){
                halfIdx = deque.size() / 2 -1;
            } else{
                halfIdx = deque.size() / 2;
            }


            // 가운데 인덱스와 찾고자 하는 인덱스 비교
            if(halfIdx >= targetIdx){
                for(int j=0; j<targetIdx; j++){
                    int temp = deque.pollFirst();
                    deque.offer(temp);
                    cnt++;
                }

            } else {
                for(int j=0; j<deque.size() - targetIdx; j++){
                    int temp = deque.pollLast();
                    deque.offerFirst(temp);
                    cnt++;
                }
            }

            deque.pollFirst();
        }

        System.out.println(cnt);
    }
}
