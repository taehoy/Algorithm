import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int n = Integer.parseInt(br.readLine());

        char result = 'a';

        for (int i = 0; i < s.length(); i++) {
            if(i+1 == n) result = s.charAt(i);
        }

        System.out.println(result);
    }
}
