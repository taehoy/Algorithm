import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int T = scanner.nextInt();
        for (int t = 0; t < T; t++) {
            int N = scanner.nextInt();
            int K = scanner.nextInt();
            
            int[][] grid = new int[N][N];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    grid[i][j] = scanner.nextInt();
                }
            }
            
            int minWaste = Integer.MAX_VALUE;
            
            for (int i = 0; i <= N - K; i++) {
                for (int j = 0; j <= N - K; j++) {
                    int wasteCount = 0;
                    for (int x = 0; x < K; x++) {
                        for (int y = 0; y < K; y++) {
                            wasteCount += grid[i + x][j + y];
                        }
                    }
                    minWaste = Math.min(minWaste, wasteCount);
                }
            }
            
            System.out.println(minWaste);
        }
        
        scanner.close();
    }
}
