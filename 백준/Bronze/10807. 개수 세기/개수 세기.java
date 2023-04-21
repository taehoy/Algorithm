import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        int[] a = new int[N];
        
        for(int i=0; i<a.length; i++) {
            int b = sc.nextInt();
            a[i] = b;
        }
        int c = sc.nextInt();
        int d = 0;
        for(int i=0; i<a.length; i++) {
            if (a[i] ==c) {
                d++;
            }
        }
        System.out.println(d);
    }
}