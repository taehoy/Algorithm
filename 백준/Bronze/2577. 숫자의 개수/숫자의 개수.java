import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num1 = Integer.parseInt(br.readLine());
        int num2 = Integer.parseInt(br.readLine());
        int num3 = Integer.parseInt(br.readLine());

        int result = num1* num2 * num3;

        int[] arr = new int[10];

        String s = String.valueOf(result);

        for(char c : s.toCharArray()){
            arr[c-'0']++;
        }

        StringBuilder sb = new StringBuilder();
        for(int n : arr){
            sb.append(n).append("\n");
        }

        System.out.println(sb);
    }
}
