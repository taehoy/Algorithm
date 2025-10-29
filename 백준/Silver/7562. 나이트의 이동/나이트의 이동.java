import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Node {
    int x, y, dist;

    Node(int x, int y, int dist) {
        this.x = x;
        this.y = y;
        this.dist = dist;
    }
}

public class Main {
    static int I;
    static int[][] board;
    static boolean[][] visited;

    static int[] dx = {1, 2,-1, -2, 2, 1, -2, -1};
    static int[] dy = {2, 1, 2, 1, -1, -2, -1, -2};
    static int result;

    static int targetX, targetY;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            I = Integer.parseInt(br.readLine());

            board = new int[I][I];
            visited = new boolean[I][I];


            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int startX = Integer.parseInt(st.nextToken());
            int startY = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine(), " ");
            targetX = Integer.parseInt(st.nextToken());
            targetY = Integer.parseInt(st.nextToken());

            System.out.println(bfs(new Node(startX, startY,0)));
        }
    }

    private static int bfs(Node node) {
        Queue<Node> q = new LinkedList<>();
        q.add(node);
        visited[node.x][node.y] = true;

        while (!q.isEmpty()) {
            Node poll = q.poll();

            int cx = poll.x;
            int cy = poll.y;

            if (cx == targetX && cy == targetY) return poll.dist;

            for (int i = 0; i < 8; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];

                if(nx < 0 || nx >=I || ny < 0 || ny >= I) continue;
                if(visited[nx][ny]) continue;

                visited[nx][ny] = true;
                q.add(new Node(nx, ny, poll.dist + 1));

            }
        }

        return -1;
    }
}