import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        // 테스트케이스 값을 입력받는다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        // 테스트 케이스 순회
        for(int i=0; i<T; i++){
            int num = 0;
            int sum = 0;
            // 문자열 입력
            String str = br.readLine();

            // 문자열 길이만큼 순회
            for(int j=0; j<str.length(); j++){
                // 만약, O면 num+1, sum += num
                if(str.charAt(j) == 'O'){
                    num++;
                    sum += num;
                } else {
                    num = 0;
                }
            }
            // num 출력
            System.out.println(sum);
        }


    }
}
