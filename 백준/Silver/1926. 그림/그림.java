

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Node {
    int x,y;

    Node(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main {
    static int n,m;
    static int max, cnt;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    static boolean[][] visited;
    static int[][] board;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        board = new int[n][m];
        visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            String[] strings = br.readLine().split(" ");
            for (int j = 0; j < m; j++) {
                board[i][j] = Integer.parseInt(strings[j]);
            }
        }

        max = 0;
        cnt = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(!visited[i][j] && board[i][j] == 1){
                    cnt++;
                    int max1 = bfs(new Node(i,j)); // 한번 돌았을때의 넓이
                    max = Math.max(max, max1);
                }
            }
        }

        System.out.println(cnt);
        System.out.println(max);
    }

    public static int bfs(Node node) {
        Queue<Node> q = new LinkedList<>();
        q.add(node);
        visited[node.x][node.y] = true;
        int result = 0;

        while(!q.isEmpty()){
            Node cNode = q.poll();
            int cx = cNode.x;
            int cy = cNode.y;

            result++;

            for (int i = 0; i < 4; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];

                if(nx < 0 || nx >=n || ny < 0 || ny >= m) continue;
                if(visited[nx][ny] || board[nx][ny] == 0) continue;
                q.add(new Node(nx, ny));
                visited[nx][ny] = true;
            }

        }

        return result;
    }

}
