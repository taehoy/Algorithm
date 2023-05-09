import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int X = sc.nextInt();
        int N = sc.nextInt();
        
        int result = 0;
        int a = 0;
        int b = 0;
        
        for(int i=0; i<N; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            
            result = result + (a * b);
        }
        
        if (result == X) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
    }
}