import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        String s = br.readLine();

        sb.append(s);
        sb.reverse();

        String s1 = sb.toString();
        String[] arr = s1.split(" ");
        int n1 = Integer.parseInt(arr[0]);
        int n2 = Integer.parseInt(arr[1]);

        System.out.println(Math.max(n1, n2));
    }
}
