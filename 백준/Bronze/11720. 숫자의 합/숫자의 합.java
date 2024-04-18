import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // 결과
        int result = 0;
        int size = sc.nextInt();
        String s = sc.next();
        String[] sArr = s.split("");

        for(int i=0; i<sArr.length; i++){
            result += Integer.parseInt(sArr[i]);
        }

        System.out.println(result);
    }
}