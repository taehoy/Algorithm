import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        int[] arr = new int[26];

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        for(char c : s.toCharArray()){
            arr[c-'a']++;
        }

        StringBuilder sb = new StringBuilder();

        for(int i : arr){
            sb.append(i).append(" ");
        }

        System.out.println(sb);

    }
}
