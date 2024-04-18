import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int solution(String str, BufferedReader br){
        // 문자 check 배열생성 -> 0이면 없는거, 1이면 있는거
        int[] check = new int[26];

        // check 배열을 이용하여 그룹 단어인지 확인하기
        for(int j=0; j<str.length(); j++){
            // 0인지 확인한다. 0 이면 건너뛴다.
            if(check[str.charAt(j) - 'a'] == 0){
                check[str.charAt(j) - 'a'] =1;
                continue;
            } else {
                // 0 이 아닌경우, 전 index랑 같은지 확인
                if(str.charAt(j-1) != str.charAt(j)){
                    return 0;
                }
            }
        }
        return 1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        // 합계 변수선언
        int sum = 0;

        // 테스트케이스만큼 반복
        for(int i=0; i<T; i++){
            sum += solution(br.readLine(), br);
        }

        System.out.println(sum);
    }
}
