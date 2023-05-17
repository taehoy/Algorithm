import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[] arr = new int[N];
        
        for(int i =0; i<arr.length; i++) {
            arr[i] = i+1;
        }
        
        int M = sc.nextInt();
        
        for(int i = 0; i<M; i++) {
            int temp;
            int I = sc.nextInt();
            int J = sc.nextInt();
            
            temp = arr[I-1];
            arr[I-1] = arr[J-1];
            arr[J-1] = temp;
        }
        
        sc.close();
        
        for(int value : arr) {
            System.out.print(value + " ");
        }
    }
}