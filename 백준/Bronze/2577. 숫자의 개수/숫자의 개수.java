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

        while(result != 0){
            arr[result % 10]++;
            result /= 10;
        }

        StringBuilder sb = new StringBuilder();
        for(int i : arr){
            sb.append(i).append("\n");
        }

        System.out.println(sb);
    }
}
