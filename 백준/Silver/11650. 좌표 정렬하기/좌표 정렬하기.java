
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        String[][] arr = new String[n][2];

        for (int i = 0; i < n; i++) {
            String[] strings = br.readLine().split(" ");
            arr[i][0] = strings[0];
            arr[i][1] = strings[1];
        }

        Arrays.sort(arr, new Comparator<String[]>(){
            public int compare(String[] o1, String[] o2) {
                int num1 = Integer.parseInt(o1[0]);
                int num2 = Integer.parseInt(o2[0]);

                if(num1 == num2){
                    int num3 = Integer.parseInt(o1[1]);
                    int num4 = Integer.parseInt(o2[1]);

                    return num3 - num4;
                } else {
                    return num1 - num2;
                }
            }
        });

        for (int i = 0; i < n; i++) {
            sb.append(arr[i][0]).append(" ").append(arr[i][1]).append("\n");
        }

        System.out.println(sb);
    }
}
