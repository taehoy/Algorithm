

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Node {
    int x, y;
    Node(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main {
    static int N;
    static int M;
    static int[][] board;
    static boolean[][] visited;

    static int max;
    static int cnt;
    // 상하좌우
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        // 방문여부, 보드판
        visited = new boolean[N][M];
        board = new int[N][M];

        // 보드 생성
        for (int i = 0; i < N; i++) {
            String[] strings = br.readLine().split(" ");
            for (int j = 0; j < M; j++) {
                board[i][j] = Integer.parseInt(strings[j]);
            }
        }

        max = 0; // 가장 큰 넓이
        cnt = 0; // 개수

        //넓이
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (!visited[i][j] && board[i][j] == 1){
                    cnt++;
                    max = Math.max(max, bfs(new Node(i, j)));
                }
            }
        }

        System.out.println(cnt);
        System.out.println(max);
    }

    private static int bfs(Node node) {
        Queue<Node> q = new LinkedList<>();
        q.add(node);
        visited[node.x][node.y] = true;
        int result = 0;

        while (!q.isEmpty()) {
            Node poll = q.poll();
            int cx = poll.x;
            int cy = poll.y;

            if(board[cx][cy] == 1) result++;

            for (int i = 0; i < 4; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];

                if(nx <0 || nx >= N || ny < 0 || ny >= M) continue;
                if(visited[nx][ny] || board[nx][ny] == 0) continue;
                visited[nx][ny] = true;
                q.add(new Node(nx, ny));
            }
        }

        return result;
    }
}
