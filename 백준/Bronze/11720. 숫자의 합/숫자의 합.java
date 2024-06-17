import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        br.readLine();

        int sum = 0;

        String s = br.readLine();

        for(int i=0; i<s.length(); i++){
            String s1 = s.substring(i,i+1);
            int n1 = Integer.parseInt(s1);

            sum += n1;
        }

        System.out.println(sum);
    }
}
