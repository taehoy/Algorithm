import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int max = 0;

        String s = br.readLine();
        String[] arr = s.split(" ");

        // 최대값 구하기
        for(int i=0; i<N; i++){
            int num = Integer.parseInt(arr[i]);
            max = Math.max(max, num);
        }

        // 모든 점수 변경
        double sum = 0;

        for(int i=0; i<N; i++){
            int currScore = Integer.parseInt(arr[i]);
            double updateScore = (double)currScore / max * 100;

            sum += updateScore;
        }

        // 평균구하기
        double result = sum / N;

        System.out.println(result);
    }
}
