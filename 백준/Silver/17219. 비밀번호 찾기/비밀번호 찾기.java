import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken()); // 저장 사이트 수
        int M = Integer.parseInt(st.nextToken()); // 찾고자 하는 사이트 수

        // 사이트 저장
        LinkedHashMap<String, String> map = new LinkedHashMap<>();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            map.put(st.nextToken(), st.nextToken()); // <사이트, 비밀번호>
        }

        // 저장된 사이트에서 사이트 찾기
        String[] findSites = new String[M];

        for (int i = 0; i < M; i++) {
            findSites[i] = br.readLine();
        }

        StringBuilder sb = new StringBuilder();

        for (String findSite : findSites) {
            String password = map.get(findSite);
            // 찾은 사이트의 비밀번호 입력
            sb.append(password).append("\n");
        }
        // 비밀번호 출력
        System.out.println(sb);

    }
}