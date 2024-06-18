import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int start = 2;
        int end = 7;
        int num = 6;            // 육각형

        for(int i=0; ; i++){
            if(N == 1){
                System.out.println(1);
                break;
            }

            if(start <= N && N <= end){
                System.out.println(i+2);
                break;
            }

            start = start + num*(i+1);
            end = end + num*(i+2);
        }
    }
}
