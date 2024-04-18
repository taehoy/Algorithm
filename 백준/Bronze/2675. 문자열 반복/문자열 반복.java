import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        // 테스트케이스 수 받기
        int testCnt = Integer.parseInt(br.readLine());

        // 각 케이스 받기 , Stringtokenzier
        for(int i=0; i<testCnt; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            String str = st.nextToken();

            for(byte value : str.getBytes()){
                for(int j=0; j<num; j++){
                    sb.append((char) value);
                }
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}
