import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();

        char c = word.charAt(0);

        System.out.println((int)c);

    }
}