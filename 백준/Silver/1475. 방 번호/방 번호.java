import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // 카드 넣을 배열 생성
        int[] arr = new int[10];
        // 9인경우 6에 ++
        while(n != 0){
            if(n % 10 == 9) arr[6]++;
            else arr[n % 10]++;
            n /= 10;

        }

        arr[6] = (int)Math.ceil((double)arr[6] / 2);

        // 배열 돌면서 가장 큰 개수가 카드의 개수
        int max = 0;


        for(int i : arr) {
            if (max < i) {
                max = i;
            }
        }

        System.out.println(max);
    }
}