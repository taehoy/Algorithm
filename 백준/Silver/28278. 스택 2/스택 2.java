import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        Stack<Integer> stack = new Stack<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb= new StringBuilder();

        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());

            String s = st.nextToken();

            if(s.equals("1")){
                stack.push(Integer.parseInt(st.nextToken()));
            } else if(s.equals("2")){
                sb.append(stack.isEmpty() ? -1 : stack.pop()).append("\n");
            } else if(s.equals("3")){
                sb.append(stack.size()).append("\n");
            } else if(s.equals("4")){
                sb.append(stack.isEmpty() ? 1 : 0).append("\n");
            } else if(s.equals("5")){
                sb.append(stack.isEmpty() ? -1 : stack.peek()).append("\n");
            }

        }

        System.out.println(sb);
    }
}
