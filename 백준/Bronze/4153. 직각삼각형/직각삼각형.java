import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if(a == 0 && b == 0 && c == 0) break;

            int aPow = (int) Math.pow(a, 2);
            int bPow = (int) Math.pow(b, 2);
            int cPow = (int) Math.pow(c, 2);

            if (cPow == (aPow + bPow)) sb.append("right").append("\n");
            else if ((cPow +aPow) == bPow) sb.append("right").append("\n");
            else if (aPow == (cPow + bPow)) sb.append("right").append("\n");
            else{
                sb.append("wrong").append("\n");
            }
        }

        System.out.println(sb);
        br.close();
    }
}
