import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(factorial(num));
    }

    private static int factorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }

        return factorial(num - 1) * num;
    }
}