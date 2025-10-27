

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        // 두배의 길이 배열 만들기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int num = Integer.parseInt(br.readLine());

        boolean[] arr = new boolean[2000001];

        for (int i = 0; i < num; i++) {
            // 입력한 값의 +1000000 의 배열에 표시
            int num1 = Integer.parseInt(br.readLine());
            arr[num1+1000000] = true;
        }

        // 배열 내 표시한 수의 -1000000을 출력한다.
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]) {
                sb.append(i - 1000000).append("\n");
            }
        }

        System.out.println(sb);
        br.close();

    }
}