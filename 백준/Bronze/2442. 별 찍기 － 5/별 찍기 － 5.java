import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int size = 2 * N -1;

        for(int i = 0; i<size; i++){
            sb.append(" ");
        }

        for(int i=0; i<N; i++){
            sb.replace(size/2-i, size/2-i+1, "*");
            sb.replace(size/2+i, size/2+i+1, "*");
            sb.replace(size/2+i+1,size+1,"");
            bw.write(sb.toString());
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
