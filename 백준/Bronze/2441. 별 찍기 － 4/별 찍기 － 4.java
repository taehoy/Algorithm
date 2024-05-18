import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<n; i++){
            sb.append("*");
        }

        for(int i=0; i<n; i++){
            bw.write(sb.toString());
            bw.newLine();
            sb.replace(i, i+1, " ");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
