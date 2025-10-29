import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 테케 입력
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
            int n = Integer.parseInt(br.readLine()); // 의상 수

            for (int j = 0; j < n; j++) {
                String[] strings = br.readLine().split(" ");
                String kind = strings[1];
                map.put(kind, map.getOrDefault(kind, 0) + 1);
            }

            int result = 1;
            for(int count : map.values()){
                result *= (count+1);
            }

            System.out.println(result-1);

        }
    }

}