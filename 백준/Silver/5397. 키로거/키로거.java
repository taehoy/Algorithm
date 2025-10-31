import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            String string = br.readLine();
            LinkedList<Character> list = new LinkedList<>();
            int cursor = 0;

            for(char c : string.toCharArray()){
                switch (c){
                    case '<':
                        if(cursor >0) cursor--;
                        break;
                    case '>':
                        if(cursor <list.size()) cursor++;
                        break;
                    case '-':
                        if(cursor >0) {
                            list.remove(cursor-1);
                            cursor--;
                        }
                        break;
                    default:
                        list.add(cursor, c);
                        cursor++;
                        break;
                }
            }

            for(char c : list){
                sb.append(c);
            }
            sb.append("\n");
        }

        System.out.println(sb);

    }
}
