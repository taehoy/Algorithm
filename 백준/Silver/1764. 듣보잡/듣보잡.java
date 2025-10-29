import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        int n = Integer.parseInt(arr[0]);// 듣못수
        int m = Integer.parseInt(arr[1]);// 보못수

        Set<String> noSeeNames = new HashSet<>();

        for (int i = 0; i < n; i++) {
            noSeeNames.add(br.readLine());
        }

        // 보못수에 추가하기
        ArrayList<String> noSeeHearNames = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            String name = br.readLine();
            if(noSeeNames.contains(name)){
                noSeeHearNames.add(name);
            }
        }

        Collections.sort(noSeeHearNames);

        int size = noSeeHearNames.size();

        StringBuilder sb = new StringBuilder();

        sb.append(size).append("\n");

        for (String name : noSeeHearNames) {
            sb.append(name).append("\n");
        }

        System.out.println(sb);
    }
}