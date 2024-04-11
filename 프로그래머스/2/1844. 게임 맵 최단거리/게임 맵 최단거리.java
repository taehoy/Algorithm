import java.util.*;

class Solution {
    static final int[] rowArr = {1, -1, 0, 0}, colArr = {0, 0, 1, -1};
    
    static class Node{
        final int row, col, move;
        
        public Node(int row, int col, int move){
            this.row = row;
            this.col = col;
            this.move = move;
        }
    }
    
    public int solution(int[][] maps) {
        // visited 만들기
        int rowLength = maps.length; // 행 길이
        int colLength = maps[0].length; // 열 길이
        
        boolean[][] visited = new boolean[rowLength][colLength];
        
        // 0일 경우 true
        for(int i=0; i<rowLength; i++){
            for(int j=0; j<maps[i].length; j++) {
                if(maps[i][j] == 0) visited[i][j] = true;
            }
        }
        
        // bfs만들기
        Queue<Node> que = new LinkedList<>();
        que.offer(new Node(0,0,1)); // 시작 위치 node 생성
        visited[0][0] = true; // 시작 위치 true
        int min = Integer.MAX_VALUE;
        
        // 시작위치에서 이동하기
        while(!que.isEmpty()){
            Node node = que.poll();
            
            for(int i=0; i<4; i++){
                int row = node.row + rowArr[i], col = node.col + colArr[i];
                if(rowLength <= row || 0> row || colLength <= col || 0 > col) continue;
                if(visited[row][col] == true) continue;
                
                visited[row][col] = true;
                que.offer(new Node(row, col, node.move+1));
                
                // 이동할 수 있는 것중 이동거리 최소값 반환
                if(row == rowLength-1 && col == colLength-1){
                    min = Math.min(min, node.move+1);
                }
            }
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }
}