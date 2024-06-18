import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        st.nextToken();
        int M = Integer.parseInt(st.nextToken());

        String s = br.readLine();
        String[] arr = s.split(" ");

        int sum = 0;

        for(int i=0; i<arr.length-2; i++){
            for(int j=i+1; j<arr.length-1; j++){
                for(int k=j+1; k<arr.length; k++){
                    int n1 = Integer.parseInt(arr[i]);
                    int n2 = Integer.parseInt(arr[j]);
                    int n3 = Integer.parseInt(arr[k]);

                    if(n1 + n2 + n3 <= M){
                        sum = Math.max(sum, n1+n2+n3);
                    }
                }
            }
        }

        System.out.println(sum);
    }
}
