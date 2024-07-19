import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s= br.readLine();

        LinkedList<Character> list = new LinkedList<>();

        for(char c : s.toCharArray()){
            list.add(c);
        }

        ListIterator<Character> iter = list.listIterator();

        while(iter.hasNext()){
            iter.next();
        }

        int M = Integer.parseInt(br.readLine());

        for(int i=0; i<M; i++){
            String cmd = br.readLine();
            char c = cmd.charAt(0);

            switch (c){
                case 'L':
                    if(iter.hasPrevious()){
                        iter.previous();
                    }
                    break;
                case 'D':
                    if(iter.hasNext()){
                        iter.next();
                    }
                    break;
                case 'B':
                    if(iter.hasPrevious()){
                        iter.previous();
                        iter.remove();
                    }
                    break;
                case 'P':
                    char t = cmd.charAt(2);
                    iter.add(t);
                    break;
                default:
                    break;
            }
        }

        StringBuilder sb = new StringBuilder();

        for(Character c : list){
            sb.append(c);
        }

        System.out.println(sb);
    }
}
