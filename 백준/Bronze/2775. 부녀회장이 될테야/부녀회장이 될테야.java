import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] arr = new int[15][15];

        // 배열 초기화, 0층 : 1,2,3,.. 1호 : 1
        for(int i=0; i<15; i++){
            arr[0][i] = i+1;
            arr[i][0] = 1;
        }

        // arr[1][1]부터 채워나가기
        for(int i=1; i<15; i++){
            for(int j=1; j<15; j++){
                arr[i][j] = arr[i-1][j] + arr[i][j-1];
            }
        }


        // 입력값 받기
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for(int i=0; i<T; i++){
            int k = Integer.parseInt(br.readLine()); // 층수
            int n = Integer.parseInt(br.readLine()); // 호수

            sb.append(arr[k][n-1]).append("\n");
        }
        System.out.println(sb);
    }
}
