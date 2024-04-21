import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.SimpleTimeZone;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 반복 횟수 받기
        String s = br.readLine();
        int size = Integer.parseInt(s);

        // 문자열 배열 생성 및 배열에 값 넣기
        String[] arr = new String[size];

        for(int i=0; i<size; i++){
            arr[i] = br.readLine();
        }

        // 문자열 길이 및 사전순 정렬 시전
        Arrays.sort(arr, new Comparator<String>(){
            public int compare(String s1, String s2){
                // 같으면 사전순
                if(s1.length() == s2.length()){
                    return s1.compareTo(s2);
                } else {
                    // 문자열 길이별 순서
                    return s1.length() - s2.length();
                }
            }
        });

        // 중복 빼고 출력하기
        StringBuilder sb = new StringBuilder();

        sb.append(arr[0] + "\n");

        for(int i=1; i<arr.length; i++){
            if(!arr[i].equals(arr[i-1])){
                sb.append(arr[i] + "\n");
            }
        }

        System.out.println(sb);
    }
}
