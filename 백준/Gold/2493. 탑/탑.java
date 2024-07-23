import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Stack;
import java.util.StringTokenizer;

class Top{
    int index;
    int height;

    Top(int num, int height){
        this.index = num;
        this.height = height;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        Stack<Top> stack = new Stack<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=1; i<=N; i++){
            int height = Integer.parseInt(st.nextToken());

            while(!stack.isEmpty()){
                if(stack.peek().height >= height){
                    sb.append(stack.peek().index).append(" ");
                    break;
                }
                stack.pop();
            }

            if(stack.isEmpty()){
                sb.append("0 ");
            }
            stack.push(new Top(i, height));
        }

        System.out.println(sb);
    }
}
