import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        int a = N/4;
        
        String b = "long ";
        
        for(int i =1; i<a; i++) {
            b += "long "; 
        }
        System.out.println(b+"int");
    }
}