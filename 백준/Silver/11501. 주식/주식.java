import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); // 테스트 케이스 수

        StringBuilder sb = new StringBuilder();

        for (int t = 0; t < T; t++) {
            int N = Integer.parseInt(br.readLine());
            int[] prices = new int[N];

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                prices[i] = Integer.parseInt(st.nextToken());
            }

            long profit = 0;      // 이익은 클 수 있으니 long
            int maxPrice = 0;     // 뒤에서부터 본 최대 주가

            // 뒤에서부터 탐색
            for (int i = N - 1; i >= 0; i--) {
                if (prices[i] > maxPrice) {
                    maxPrice = prices[i]; // 미래의 최고가 갱신
                } else {
                    profit += (maxPrice - prices[i]); // 그날 주식 사서 최고가에 판다고 가정
                }
            }

            sb.append(profit).append("\n");
        }

        System.out.print(sb);
    }
}
