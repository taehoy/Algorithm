import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main{
    static int count = 0;
    // visited
    static boolean[] visited;
    // 2차배열
    static int[][] arr;
    // node, line, start
    static int node, line;
    // que
    static Queue<Integer> que = new LinkedList<>();


    public static void main(String[] args) throws IOException {
        // 입력받기
        Scanner sc = new Scanner(System.in);

        // 노라소 입력받기
        node = sc.nextInt();
        line = sc.nextInt();

        // 체크, 배열크기 설정
        visited = new boolean[node + 1];
        arr = new int[node + 1][node + 1];

        // 배열 값 설정 , 입력받기
        for (int i = 0; i < line; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            arr[a][b] = arr[b][a] = 1;
        }

        //bfs
        System.out.println(bfs(1)-1);

    }

    static int bfs(int start) {
        que.add(start);
        visited[start] = true;

        while (!que.isEmpty()) {
            start = que.poll();
            // 카운트 증가
            count++;

            for (int i = 1; i <= node; i++) {
                if (!visited[i] && arr[start][i] == 1) {
                    que.add(i);
                    visited[i] = true;
                }
            }
        }

        return count;
    }

    static int dfs(int start){
        visited[start] = true;
        count++;

        for(int i=0; i<=node; i++){
            if(!visited[i] && arr[start][i] == 1){
                dfs(i);
            }
        }

        return count;
    }
}
