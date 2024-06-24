import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        // 카운팅 정렬 이용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringBuilder[] p = new StringBuilder[201];

        for(int i=0; i<p.length; i++){
            p[i] = new StringBuilder();
        }

        for(int i=0; i<N; i++){
            String[] arr = br.readLine().split(" ");
            int age = Integer.parseInt(arr[0]);
            String name = arr[1];

            p[age].append(age).append(' ').append(name).append("\n");
        }

        StringBuilder sb = new StringBuilder();
        for(StringBuilder var : p){
            sb.append(var);
        }
        System.out.println(sb);

    }
}
