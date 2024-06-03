import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        
        // 바구니 만들기
        Stack<Integer> stack = new Stack<>();
    
        // 인형 잡기
        for(int i=0; i<moves.length; i++){
            int pick = 0; // 집은 인형 번호
            
            // 인형상자에서 인형 집기
            for(int j=0; j<board.length; j++){
                if(board[j][moves[i]-1] != 0){
                    pick = board[j][moves[i]-1];
                    board[j][moves[i]-1] = 0;
                    break;
                }
            }
            
            // 크레인의 열에 아무것도 없으면 건너뜀
            if(pick == 0) continue;
            
            // 바구니와 비교
            if(stack.isEmpty() || stack.peek() != pick){
                stack.push(pick);
                continue;
            }
            stack.pop();
            answer+=2;
            
        }
        
        return answer;
    }
}