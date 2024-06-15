import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 첫 번째 줄 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // rlacjftn가 살아온 날짜 수
        int M = Integer.parseInt(st.nextToken()); // 궁금한 날짜 구간의 개수
        
        // 두 번째 줄 입력 (수입/지출 내역)
        long[] C = new long[N + 1];
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            C[i] = Long.parseLong(st.nextToken());
        }
        
        // 누적 합 배열 생성
        long[] prefixSum = new long[N + 1];
        prefixSum[1] = C[1];
        for (int i = 2; i <= N; i++) {
            prefixSum[i] = prefixSum[i - 1] + C[i];
        }
        
        // 세 번째 줄부터 M개의 줄 입력 및 처리
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            
            // 구간 합 계산
            long sum;
            if (a == 1) {
                sum = prefixSum[b];
            } else {
                sum = prefixSum[b] - prefixSum[a - 1];
            }
            
            // 출력 포맷 설정
            if (sum >= 0) {
                sb.append('+').append(sum).append('\n');
            } else {
                sb.append(sum).append('\n');
            }
        }
        
        // 결과 출력
        System.out.print(sb.toString());
    }
}
