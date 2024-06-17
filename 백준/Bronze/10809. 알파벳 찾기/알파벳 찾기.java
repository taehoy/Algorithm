import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        String s = br.readLine();

        int[] check = new int[26];

        for(int i=0; i<26; i++){
            check[i] = -1;
        }

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            int n = c - 'a';
            if(check[n] == -1) {
                check[n] = i;
            }
        }

        for(int i=0; i<26; i++){
            sb.append(check[i] + " ");
        }

        System.out.println(sb);

    }
}
