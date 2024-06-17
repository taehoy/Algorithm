import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Integer> map = new HashMap<>();

        map.put("ABC", 3);
        map.put("DEF", 4);
        map.put("GHI", 5);
        map.put("JKL", 6);
        map.put("MNO", 7);
        map.put("PQRS", 8);
        map.put("TUV", 9);
        map.put("WXYZ", 10);

        String s = br.readLine();
        int sum = 0;

        for(int i=0; i<s.length(); i++){
            String s1 = s.substring(i, i+1);

            for(String s2 : map.keySet()){
                if(s2.contains(s1)){
                    sum +=map.get(s2);
                    continue;
                }
            }
        }

        System.out.println(sum);
    }
}
