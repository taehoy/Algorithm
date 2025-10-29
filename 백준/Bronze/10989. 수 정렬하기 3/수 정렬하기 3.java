import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        
        int[] nums = new int[10001];
        
        for(int i=0; i<N; i++){
            nums[Integer.parseInt(br.readLine())]++;
        }
        
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        for(int i=0; i<nums.length; i++){
            if(nums[i] ==0) continue;
            
            bw.write((i+"\n").repeat(nums[i]));
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
}