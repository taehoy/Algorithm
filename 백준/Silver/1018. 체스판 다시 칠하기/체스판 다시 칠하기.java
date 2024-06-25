import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        // 1.input 받기
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        int row = Integer.parseInt(arr[0]); // 행
        int col = Integer.parseInt(arr[1]); // 열

        String[] board = new String[row];
        for(int i=0; i<row; i++){
            board[i] = br.readLine();
        }

        // 2. 체스판 자르기
        int sol = Integer.MAX_VALUE;
        for(int i=0; i<=row-8; i++){
            for(int j=0; j<=col-8; j++){
                // 3.해당 체스판 최소 칠한 횟수 구하기(블랙 or 화이트)
                int curSol = getSolution(i, j, board);
                // 4. 전체 체스판 최소 칠한 횟수 구하기
                if(sol > curSol) sol = curSol;

            }
        }

        System.out.println(sol);
        br.close();

    }

    // 화이트 기준
    private static int getSolution(int startRow, int startCol, String[] board) {
        String[] orgBoard = {"WBWBWBWB", "BWBWBWBW"};
        int whiteSol = 0;

        for(int i=0; i<8; i++){
            int row = startRow + i;
            for(int j=0; j<8; j++){
                int col = startCol + j;
                if(board[row].charAt(col) != orgBoard[row % 2].charAt(j)) whiteSol++;
            }
        }

        return Math.min(whiteSol, 64 - whiteSol);
    }
}
