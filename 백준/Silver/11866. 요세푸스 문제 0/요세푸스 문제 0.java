import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = br.readLine().split(" ");

        int N = Integer.parseInt(arr[0]);
        int K = Integer.parseInt(arr[1]);

        List<Integer> list = new ArrayList<>();

        for(int i = 1; i<=N; i++){
            list.add(i);
        }

        int idx = 0;

        StringBuilder sb = new StringBuilder();
        sb.append('<');

        while(N > 1){
            idx = (idx + (K-1)) % N;
            sb.append(list.remove(idx)).append(", ");
            N--;
        }

        sb.append(list.remove(0)).append('>');
        System.out.println(sb);

    }
}
