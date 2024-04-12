import java.util.*;

class Solution {
    // +, - 만들기
    static int[] rowArr = {1,-1,0,0};
    static int[] colArr = {0,0,1,-1};
    // visited, arr[[][] 만들기
    static boolean[][] visited;
    static int[][] arr;
    int rowLength, colLength;
    
    static Queue<Node> que = new LinkedList<>();
    
    // 현재위치 node 만들기
    public class Node{
        int row, col, move;
        Node(int row, int col, int move){
            this.row = row;
            this.col = col;
            this.move = move;
        }
    }
    
    public int solution(int[][] maps) {
        // maps의 길이만큼 visited, arr 생성하기
        rowLength = maps.length;
        colLength = maps[0].length;
        
        visited = new boolean[maps.length+1][colLength+1];
        arr = new int[rowLength+1][colLength+1];
        
        // visited값 설정하기
        for(int i=0; i<rowLength; i++){
            for(int j=0; j<colLength; j++){
                if(maps[i][j] == 0) visited[i][j] = true;
            }
        }
        
        // bfs구현하기
        que.offer(new Node(0,0,1));
        visited[0][0] = true;
        int min = Integer.MAX_VALUE;
        
        while(!que.isEmpty()){
            Node node = que.poll();
            
            for(int i=0; i<4; i++){
                int row = node.row + rowArr[i];
                int col = node.col + colArr[i];
                
                if(row <0 || row>=rowLength || col < 0 || col >= colLength) continue;
                if(visited[row][col] == true) continue;
                visited[row][col] = true;
                que.offer(new Node(row, col, node.move+1));
                
                // 최소값 반환
                if(row == rowLength-1 && col == colLength-1){
                    min = Math.min(min, node.move+1);
                }
            }
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }
}