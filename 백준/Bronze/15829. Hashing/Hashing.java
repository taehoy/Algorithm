import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        br.readLine();
        String s = br.readLine();

        int r = 31;

        int sum = 0;

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);

            int a = (int)c - 'a'+1;

            sum += a * (int)Math.pow(r, i) % 1234567891;
        }

        System.out.println(sum);

    }
}
