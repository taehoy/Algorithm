import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    static class Node {
        int x;
        int y;

        Node(int n, int m){
            x = n;
            y = m;
        }
    }

    static int[][] board;
    static boolean[][] vis;

    static int n;
    static int m;
    static int[] dx = new int[]{1, 0, -1, 0};
    static int[] dy = new int[]{0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        n = Integer.parseInt(arr[0]);
        m = Integer.parseInt(arr[1]);

        board = new int[n][m];
        vis = new boolean[n][m];

        for(int i=0; i<n; i++){
            String[] strings = br.readLine().split(" ");
            for(int j=0; j<m; j++){
                board[i][j] = Integer.parseInt(strings[j]);
            }
        }

        int mx = 0; // 그림의 최댓값
        int num = 0; // 그림의 수

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(board[i][j] == 0 || vis[i][j]) continue;

                num++; // 그림 개수 +1
                Queue<Node> q = new LinkedList<>();

                vis[i][j] = true;
                q.offer(new Node(i,j));

                int area = 0; // 그림 크기

                while(!q.isEmpty()){
                    area++; // 크기 +1
                    Node curr = q.poll();

                    for(int k =0; k<4; k++){
                        int nx = curr.x + dx[k];
                        int ny = curr.y + dy[k];

                        if(nx <0 || nx >=n || ny <0 || ny >= m) continue;
                        if(vis[nx][ny] || board[nx][ny] != 1) continue;
                        vis[nx][ny] = true;
                        q.offer(new Node(nx,ny));
                    }
                }

                mx = Math.max(mx, area);

            }
        }
        System.out.println(num);
        System.out.println(mx);
    }

}
