import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String[][] arr = new String[N][2];

        for(int i=0; i<N; i++){
            String[] temp = br.readLine().split(" ");
            arr[i][0] = temp[0];
            arr[i][1] = temp[1];
        }

        Arrays.sort(arr, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                int y1 = Integer.parseInt(o1[1]);
                int y2 = Integer.parseInt(o2[1]);

                int result = y1-y2;

                // x좌표가 같을 경우
                if(result == 0) {
                    int x1 = Integer.parseInt(o1[0]);
                    int x2 = Integer.parseInt(o2[0]);
                    return x1 - x2;
                }

                return result;
            }
        });

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<N; i++){
            sb.append(arr[i][0]).append(' ').append(arr[i][1]).append("\n");
        }

        System.out.println(sb);
    }
}
