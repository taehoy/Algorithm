import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();


        while(true){
            String s = br.readLine();

            if(s.equals("0")) break;

            boolean flag = false;
            int size = s.length();

            for(int i=0; i<size/2; i++){
                char c1 = s.charAt(i);
                char c2 = s.charAt(size-1-i);

                if(c1 != c2){
                    sb.append("no").append("\n");
                    flag = true;
                    break;
                }
            }

            if(!flag){
                sb.append("yes").append("\n");
            }
        }
        System.out.println(sb);
    }
}
