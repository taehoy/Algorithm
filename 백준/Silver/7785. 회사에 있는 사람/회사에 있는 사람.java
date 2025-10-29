import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String[] strings = br.readLine().split(" ");
            String name = strings[0];
            String cmd = strings[1];

            if (cmd.equals("enter")) {
                if(map.containsKey(name)) continue;
                map.put(name, 1);
            } else {
                if(map.containsKey(name)) map.remove(name);
            }

        }

        StringBuilder sb = new StringBuilder();

        ArrayList<String> names = new ArrayList<>();

        for (String name : map.keySet()) {
            names.add(name);
        }

        Collections.sort(names, Collections.reverseOrder());

        for (String name : names) {
            sb.append(name).append("\n");
        }

        System.out.println(sb);
    }

}