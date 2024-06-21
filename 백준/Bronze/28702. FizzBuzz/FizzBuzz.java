import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        for(int i = 3; i>0; i--){
            String s = br.readLine();
            
            if(s.matches("-?\\d+(\\.\\d+)?")){
                int n = Integer.parseInt(s) + i;
                
                if(n % 3 == 0 && n % 5 == 0) System.out.println("FizzBuzz");
                else if(n % 3 == 0 && n % 5 != 0) System.out.println("Fizz");
                else if(n % 5 == 0 && n % 3 != 0) System.out.println("Buzz");
                else System.out.println(n);
                
                break;
            }
        }
        br.close();
    }
}