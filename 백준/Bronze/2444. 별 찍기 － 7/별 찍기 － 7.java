import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int size = 2 * n -1;

        for(int i=0; i<n; i++){
            for(int j = 0; j<n-1-i; j++){
                sb.append(" ");
            }
            for(int j = 0; j<2 * i +1; j++){
                sb.append("*");
            }
            sb.append("\n");
        }

        for(int i=1; i<n; i++){
            for(int j=0; j<i; j++){
                sb.append(" ");
            }
            for(int j=0; j<size - 2 * i; j++){
                sb.append("*");
            }
            sb.append("\n");
        }
        
        System.out.print(sb);
    }
}
