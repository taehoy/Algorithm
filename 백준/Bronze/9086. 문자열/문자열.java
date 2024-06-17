import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n  = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++){
            String s = br.readLine();

            if(s.length()==1){
                System.out.println(s+s);
                continue;
            }

            String s1 = s.substring(0,1);
            String s2 = s.substring(s.length()-1, s.length());

            System.out.println(s1+s2);
        }
    }
}
