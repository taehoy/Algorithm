

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr1 = new int[3];
        for (int i = 0; i < 3; i++) {
            arr1[i] = Integer.parseInt(br.readLine());
        }

        int result = arr1[0] * arr1[1] * arr1[2];

        int[] arr = new int[10];

        while(result != 0){
            int num = result % 10;
            result /= 10;
            arr[num]++;

        }

        StringBuilder sb = new StringBuilder();
        for(int i : arr){
            sb.append(i).append("\n");
        }

        System.out.println(sb);

    }
}
