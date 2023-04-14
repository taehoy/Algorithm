import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        
        A = A + (B+C)/60;
        B = (B+C)%60;
        
        if(A>=24){
            A -= 24;
        }
        
        System.out.println(A+" "+B);
    }
}