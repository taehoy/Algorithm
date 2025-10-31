import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        String[] strings = br.readLine().split(" ");
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(strings[i]);
        }

        int x = Integer.parseInt(br.readLine());

        Arrays.sort(arr);

        int left = 0;
        int right = n-1;
        int cnt = 0;

        while(left < right){
            int sum = arr[left] + arr[right];

            if(sum == x){
                cnt++;
                left++;
                right--;
            } else if(sum < x) {
                left ++;
            } else {
                right--;
            }
        }

        System.out.println(cnt);
    }
}