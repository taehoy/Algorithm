import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        // 순서 입력받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        // 입력된 순서에 해당하는 분수 출력
        int sum = 0;
        int cnt = 0;
        while(sum < T){
            cnt += 1;
            sum += cnt;
        }

        sum -= cnt;

        int index = T - sum;

        int up = index;
        int down = cnt - index +1;

        if(cnt % 2 == 0){
            System.out.printf("%d/%d", up, down);
        } else {
            if(T==1) System.out.println("1/1");
            else System.out.printf("%d/%d", down, up);
        }
    }
}
