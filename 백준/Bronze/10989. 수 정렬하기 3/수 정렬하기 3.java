import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        
        int[] nums = new int[10001];
        
        for(int i=0; i<N; i++){
            nums[Integer.parseInt(br.readLine())]++;
        }
        
        br.close();
        
        // 수 출력 
        for(int i=0; i<nums.length; i++){
            if(nums[i] ==0) continue;
            
            bw.write((i+"\n").repeat(nums[i]));
        }
        
        bw.flush();
        bw.close();
    }
}