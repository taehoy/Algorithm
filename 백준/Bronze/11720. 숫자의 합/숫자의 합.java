import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String s = br.readLine();

        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int num = ch - '0';

            result += num;
        }

        System.out.println(result);

    }
}
