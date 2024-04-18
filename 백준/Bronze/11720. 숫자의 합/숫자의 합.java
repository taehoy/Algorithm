import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        
        int result = 0;
        
        for(Byte bt : br.readLine().getBytes()){
            result += (bt - '0');
        }
        
        System.out.println(result);
    }
}