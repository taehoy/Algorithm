import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N =Integer.parseInt(br.readLine());

        String[][] arr = new String[N][2];

        StringTokenizer st;

        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine(), " ");
            arr[i][0] = st.nextToken();
            arr[i][1] = st.nextToken();
        }

        Arrays.sort(arr, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                int x1 = Integer.parseInt(o1[0]);
                int x2 = Integer.parseInt(o2[0]);

                int result = x1 - x2;

                if(result == 0){
                    int y1 = Integer.parseInt(o1[1]);
                    int y2 = Integer.parseInt(o2[1]);

                    return y1 - y2;
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
