import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        // 0 이면 0 리턴
        if(N == 0){
            System.out.println(0);
            return;
        }

        // 1. 입력받기
        int[] arr = new int[N];
        for(int i =0; i<N; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        // 2. 절사평균 범위 구하기
        int scope = 0;
        scope = (int)Math.round(N * 0.15);

        // 3. 절사평균 구하기
        int minIdx = scope;
        int maxIdx = N - scope;

        int result = 0;
        int sum = 0;
        int cnt = 0;

        for(int i=minIdx; i<maxIdx; i++){
            sum += arr[i];
            cnt++;
        }
        result = (int)Math.round((double)sum / cnt);

        System.out.println(result);
    }
}
