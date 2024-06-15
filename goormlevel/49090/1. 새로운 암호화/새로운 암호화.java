import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        long A = scanner.nextLong();
        long B = scanner.nextLong();
        
        long result = xorRange(A, B);
        
        System.out.println(result);
        
        scanner.close();
    }
    
    // Function to compute XOR from A to B
    private static long xorRange(long A, long B) {
        // XOR from 0 to B is efficiently computed using a pattern
        return xorFromZeroTo(B) ^ xorFromZeroTo(A - 1);
    }
    
    // Function to compute XOR from 0 to N
    private static long xorFromZeroTo(long N) {
        if (N < 0) return 0; // Edge case if N is negative
        
        switch ((int) (N % 4)) {
            case 0: return N;
            case 1: return 1;
            case 2: return N + 1;
            case 3: return 0;
        }
        
        return 0; // Default return, though it should never reach here
    }
}
