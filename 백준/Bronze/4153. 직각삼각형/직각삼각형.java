import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int n1 = Integer.parseInt(st.nextToken());
            int n2 = Integer.parseInt(st.nextToken());
            int n3 = Integer.parseInt(st.nextToken());

            // 0 0 0 이면 종료
            if(n1 == 0 && n2 == 0 && n3 == 0) break;

            if((n1 * n1 + n2 * n2) == n3 * n3) sb.append("right").append("\n");
            else if(n1 * n1 == (n2 * n2 + n3 * n3)) sb.append("right").append("\n");
            else if((n1 * n1 + n3 * n3) == n2 * n2) sb.append("right").append("\n");
            else sb.append("wrong").append("\n");

        }
        System.out.println(sb);
        br.close();
    }
}
