import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[10001];

        for(int i=0; i<N; i++){
            arr[Integer.parseInt(br.readLine())]++;
        }
        br.close();

        // 출력
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 0) continue;

            bw.write((i+"\n").repeat(arr[i]));
        }

        bw.flush();
        bw.close();
    }
}
