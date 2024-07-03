import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        int N = Integer.parseInt(arr[0]); // 듣못 수
        int M = Integer.parseInt(arr[1]); // 보못 수

        // 1. 듣못 명단 입력
        Set<String> noListenNames = new HashSet<>();

        for(int i=0; i<N; i++){
            String name = br.readLine();
            noListenNames.add(name);
        }
        // 2. 듣못 명단에 보못 포함 여부확인
        List<String> noListenSeeNames = new ArrayList<>();

        for(int i=0; i<M; i++){
            String name = br.readLine();
            if(noListenNames.contains(name)){
                noListenSeeNames.add(name);
            }
        }

        // 3. 듣보못 명단 출력
        int size = noListenSeeNames.size();

        // 듣보못 0명인 경우
        if(size == 0){
            System.out.println(size);
            return;
        }

        Collections.sort(noListenSeeNames);

        StringBuilder sb = new StringBuilder();

        sb.append(size).append("\n");

        for(String name : noListenSeeNames){
            sb.append(name).append("\n");
        }

        System.out.println(sb);
    }
}
