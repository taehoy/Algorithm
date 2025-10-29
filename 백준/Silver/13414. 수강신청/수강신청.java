import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int K = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < L; i++) {
            String hakbun = br.readLine();
            if (map.containsKey(hakbun)) map.remove(hakbun);
            map.put(hakbun, i);
        }

        int count = 0;

        StringBuilder sb = new StringBuilder();

        for (String key : map.keySet()) {
            sb.append(key).append("\n");
            if(++count == K) break;
        }

        System.out.println(sb);
    }
}