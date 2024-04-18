import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        // 문자열 입력받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        
        // 값이 0 인 배열 만든다 -> 길이: 26, 문자 count용 배열
        int[] arr = new int[26];
        for(int i=0; i<26; i++){
            arr[i] = 0;
        }

        // 문자열 순회한다.
        for(int i=0; i<str.length(); i++){
            // 해당 문자의 -'a'한 값 = 값이 0인 배열의 인덱스이므로 +1
            if('a' <= str.charAt(i) && str.charAt(i) <= 'z'){
                arr[str.charAt(i) - 'a']++; // 소문자일경우 -'a'
            } else {
                arr[str.charAt(i) - 'A']++; // 대문자일 경우 -'A'
            }
        }

        // 기존 배열 복사 배열 만들기
        int[] temp = new int[26];
        for(int i=0; i<temp.length; i++){
            temp[i] = arr[i];
        }

        // 정수 배열 오름차순 정렬
        Arrays.sort(arr);

        // 만약, 정수 배열의 인덱스[length-1] 과 [length-2]이 같다면 중복 -> ? 출력
        if(arr[arr.length-1] == arr[arr.length-2]) System.out.println("?");
        else {
            int index = 0; // 출력할 인덱스

            // 오름차순한 정렬의 arr[length-1]번째 값을 이용해서 기존 복사 배열에서 같은 값이 위치한 index 구하기
            for(int i=0; i<temp.length; i++){
                if(arr[arr.length-1] == temp[i]) {
                    index = i;
                }
            }
            // 중복되지 않으면 'A' + 인덱스 출력
            char c = (char)('A' + index);
            System.out.println(c);
        }

    }
}
