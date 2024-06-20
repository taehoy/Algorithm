import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        BigInteger num= factorial(BigInteger.valueOf(N));

        String s = String.valueOf(num);
        int count = 0;

        for(int i=s.length()-1; i>=0; i--){
            char c = s.charAt(i);

            if(c != '0') break;
            count++;
        }

        System.out.println(count);
    }

    private static BigInteger factorial(BigInteger n) {

        if(n.compareTo(BigInteger.ONE) <= 0){
            return BigInteger.ONE;
        } else{
            return n.multiply(factorial((n.subtract(BigInteger.ONE))));
        }
    }
}
