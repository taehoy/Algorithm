import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int T = Integer.parseInt(br.readLine());

        // 문자열 배열 만든다.
        String[] strArr = new String[T];

        // 문자열 배열에 입력 값 넣기
        for(int i=0; i<T; i++){
            strArr[i] = br.readLine();
        }

        Arrays.sort(strArr, new Comparator<String>(){
            public int compare(String s1, String s2){
                // 길이가 같으면 사전순 정렬
                if(s1.length() == s2.length()){
                    return s1.compareTo(s2);
                } else {
                    // 길이 다르면 오름차순 정렬
                    return s1.length() - s2.length();
                }
            }
        });

        sb.append(strArr[0] + "\n");

        // 중복되면 패스
        for(int i=1; i< strArr.length; i++){
            if(!strArr[i].equals(strArr[i-1])){
                sb.append(strArr[i]+"\n");
            }
        }

        System.out.println(sb);
    }
}
