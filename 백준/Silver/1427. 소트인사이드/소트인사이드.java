import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] arr = s.split("");

        // byte 배열의 각 요소 크기 비교 -> 내림차순 정렬
        Arrays.sort(arr, new Comparator<String>(){
            public int compare(String s1, String s2){
                return Integer.parseInt(s2) - Integer.parseInt(s1);
            }
        });

        StringBuilder sb = new StringBuilder();

        for(String ss : arr){
            sb.append(ss);
        }

        System.out.println(sb);
    }
}
