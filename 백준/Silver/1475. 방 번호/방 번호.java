import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        int[] arr = new int[10];

        for(char c : s.toCharArray()){
            if(c-'0' == 9){
                arr[6]++;
            } else{
                arr[c-'0']++;
            }
        }

        arr[6] = (int)Math.ceil((double)arr[6]/2);

        int max = 0;
        for(int i : arr){
            max = Math.max(max, i);
        }

        System.out.println(max);
    }
}
