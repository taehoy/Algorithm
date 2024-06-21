import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[][] arr = new int[N][2];

        String[] s;
        // 배열에 값 넣기
        for(int i = 0; i<N; i++){
            s = br.readLine().split(" ");
            arr[i][0] = Integer.parseInt(s[0]);
            arr[i][1] = Integer.parseInt(s[1]);
        }

        StringBuilder sb = new StringBuilder();

        // 등수 비교하기
        for(int i =0; i<N; i++){
            int rank = 1;

            for(int j=0; j<N; j++){
                if(i == j) continue;

                if(arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]){
                    rank++;
                }
            }

            sb.append(rank).append(' ');

        }

        System.out.println(sb);
    }
}
