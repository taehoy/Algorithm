import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        // 1. boolean 배열 만들기 -> false면 없음, true면 있음
        boolean[] arr = new boolean[20];
        // 입력 값에 따라 처리하기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();

            if(cmd.equals("add")){
                int num = Integer.parseInt(st.nextToken());
                if(arr[num-1] == true) continue;
                arr[num-1] = true;
            } else if(cmd.equals("remove")){
                int num = Integer.parseInt(st.nextToken());
                if(arr[num-1] == false) continue;
                arr[num-1] = false;
            } else if(cmd.equals("check")){
                int num = Integer.parseInt(st.nextToken());
                if(arr[num-1] == true) sb.append(1).append("\n");
                else sb.append(0).append("\n");
            } else if(cmd.equals("toggle")) {
                int num = Integer.parseInt(st.nextToken());
                if (arr[num - 1] == true) arr[num - 1] = false;
                else arr[num - 1] = true;
            } else if(cmd.equals("all")) {
                for(int j=0; j<arr.length; j++){
                    arr[j] = true;
                }
            } else if(cmd.equals("empty")){
                for(int j=0; j<arr.length; j++){
                    arr[j] = false;
                }
            }
        }

        System.out.println(sb);
    }
}
