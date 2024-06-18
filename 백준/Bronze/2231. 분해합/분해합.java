import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        int constructor = 0;

        for(int i=1; i<=num; i++){
            if(num == PartSum(i)){
                   constructor = i;
                   break;
            }
        }

        System.out.println(constructor);
    }

    private static int PartSum(int num) {
        int result = num;

        while(num >= 1){
            result += num % 10;
            num /= 10;
        }

        return result;
    }
}
