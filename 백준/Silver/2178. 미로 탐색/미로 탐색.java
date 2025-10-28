

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

class Node{
    int x,y;
    Node(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main {
    static int N, M;
    static int[][] board;
    static boolean[][] visited;
    static int result;

    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strings = br.readLine().split(" ");

        N = Integer.parseInt(strings[0]);
        M = Integer.parseInt(strings[1]);

        board = new int[N][M];
        visited = new boolean[N][M];



        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < M; j++) {
                char c = str.charAt(j);
                board[i][j] = c - '0';
            }
        }

        System.out.println(bfs(new Node(0,0)));

    }

    public static int bfs(Node node) {
        Queue<Node> q = new LinkedList<>();
        visited[node.x][node.y] = true;
        q.add(node);


        while (!q.isEmpty()) {
            Node node1 = q.poll();

            int cx = node1.x;
            int cy = node1.y;


            for (int i = 0; i < 4; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];

                if(nx<0 || nx >=N || ny < 0 || ny >= M) continue;
                if(visited[nx][ny] || board[nx][ny] == 0) continue;
                q.add(new Node(nx, ny));
                board[nx][ny] = board[cx][cy] + 1;
                visited[nx][ny] = true;
            }
        }

        return board[N-1][M-1];
    }
}
