import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    static Set<Integer> numberSet = new HashSet<>();

    public static void main(String[] args) throws IOException {
        //1. 입력값 받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //2. N정수 담을 Set 만들기
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        while(st.hasMoreTokens()){
            numberSet.add(Integer.parseInt(st.nextToken()));
        }

        //3. M정수 포함 여부 판단
        StringBuilder sb = new StringBuilder();
        int M = Integer.parseInt(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine()," ");
        while(st2.hasMoreTokens()){
            if(isContains(st2.nextToken())){
                sb.append('1').append("\n");
            } else {
                sb.append('0').append("\n");
            }
        }

        //4. 포함 여부에 따른 값 출력하기
        System.out.println(sb);

        br.close();
    }

    private static boolean isContains(String m) {
        int num = Integer.parseInt(m);
        if(numberSet.contains(num))
            return true;
        return false;
    }
}
