import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        // 알파벳 배열 만든다.
        String[] arr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        // 알파벳 배열 순회
        for(String s : arr){
            str = str.replace(s, "a"); // 크로아티아 알파벳을 임의의 한글자 문자로 변경
        }

        System.out.println(str.length());
    }
}
