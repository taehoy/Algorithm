import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int getNumOfRooms(int num){
        int cnt = 1;

        while(num > 1){
            num -= (6 * cnt);
            cnt++;
        }
        return cnt;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        System.out.println(getNumOfRooms(N));

    }
}
