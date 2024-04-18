import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        // 테스트케이스 수 받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCnt = Integer.parseInt(br.readLine());

        // 각 케이스 받기 , Stringtokenzier
        for(int i=0; i<testCnt; i++){
            String answer = "";
            StringTokenizer st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            String str = st.nextToken();

            // 입력받은 문자열의 길이 * 반복수만큼 loop
            for(int j=0; j<str.length() * num; j++){
                // loop돌면서 각 단어 * 반복횟수를 sb에 추가한다.
                answer += str.charAt(j/num) + "";
            }
            System.out.println(answer);

        }
    }
}
