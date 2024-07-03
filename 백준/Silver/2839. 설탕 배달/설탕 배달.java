import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        // 1. 목표 kg 입력받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        // 2. 목표 kg에 맞춰 봉지 최소 개수 구하기

        // 5로 나눈 몫부터 0까지반복
        int size = N / 5;
        int count = 0; // 봉지 개수

        if(N % 5 == 0){
            count = size;
            System.out.println(count);
            return;
        }

        for(int i=size; i>=0; i--){
            int num = N - (5 * i);
            if(num % 3 ==0){
                count = i + num / 3;
                break;
            }
        }

        // 3. 최소 개수 구하지 못하면 -1
        if(count == 0) {
            System.out.println(-1);
        } else
            System.out.println(count);
    }
}
