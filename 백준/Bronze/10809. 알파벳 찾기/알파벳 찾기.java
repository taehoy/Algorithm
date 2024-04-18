import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        // 문자열 받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        // -1 배열 만들기 : 길이 26
        int[] arr = new int[26];
        for(int i=0; i<arr.length; i++){
            arr[i] = -1;
        }

        // 받은 문자열의 0번째부터 순회
        for(int i=0; i<str.length(); i++){
            int num = str.charAt(i) -'a'; // s[0] - 'a' = -1의 인덱스
            if(arr[num] != -1) continue;
            arr[num] = i; // 문자열인덱스 = 값
        }

        // -1배열 출력
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}
