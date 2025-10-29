import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

class Node {
    int x;
    int y;

    Node(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main {
    static int N;
    static char[][] board;
    static boolean[][] visited;

    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};

    static int result1;
    static int result2;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        board = new char[N][N];
        visited = new boolean[N][N];

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < N; j++) {
                board[i][j] = str.charAt(j);
            }
        }

        // 적록색맹 x
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if(!visited[i][j]) {
                    bfs(new Node(i, j));
                    result1++;
                }
            }
        }

        // 적록색맹 O -> r과 g는 같음
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (board[i][j] == 'G') {
                    board[i][j] = 'R';
                }
            }
        }

        visited = new boolean[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if(!visited[i][j]) {
                    bfs(new Node(i, j));
                    result2++;
                }
            }
        }

        System.out.print(result1 + " " + result2);

    }

    private static void bfs(Node node) {
        Queue<Node> q = new LinkedList<>();
        q.add(node);
        visited[node.x][node.y] = true;
        char color = board[node.x][node.y];

        while (!q.isEmpty()) {
            Node poll = q.poll();
            int cx = poll.x;
            int cy = poll.y;


            for (int i = 0; i < 4; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];

                if(nx <0 || nx >= N || ny <0 || ny >=N) continue;
                if(visited[nx][ny] || board[nx][ny] != color) continue;
                visited[nx][ny] = true;
                if(color == board[nx][ny]) q.add(new Node(nx, ny));
            }
        }
    }
}