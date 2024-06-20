import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        List<String> list = new ArrayList<>();

        for(int i=0; i<N; i++){
            String s = br.readLine();

            if(list.contains(s)) continue;

            list.add(s);
        }

        Collections.sort(list, new Comparator<String>(){

            public int compare(String s1, String s2){
                int length1 = s1.length();
                int length2 = s2.length();

                int result = length1 - length2;

                if(result ==0){
                    return s1.compareTo(s2);
                }

                return result;
            }

        });

        StringBuilder sb = new StringBuilder();

        for(String s : list){
            sb.append(s).append("\n");
        }

        System.out.println(sb);

        br.close();
    }
}
