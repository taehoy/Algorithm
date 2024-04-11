import java.util.*;
import java.io.*;

public class Main{
    static StringBuilder sb = new StringBuilder();
    // visited
    static boolean[] visited;
    // 2차배열
    static int[][] arr;
    // node, line, start
    static int node, line, start;
    // que
    static Queue<Integer> que = new LinkedList<>();
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 노드, 라인 수, 시작 값 받기
        node = Integer.parseInt(st.nextToken());
        line = Integer.parseInt(st.nextToken());
        start = Integer.parseInt(st.nextToken());


        // 2차 배열 설정하기
        arr = new int[node+1][node+1];

        // dfs 체크용 visited 생성
        visited = new boolean[node+1];

        // 2차 배열 값 넣기 -> 연결되어있으면 1
        for(int i=0; i<line; i++){
            StringTokenizer str = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(str.nextToken());
            int b = Integer.parseInt(str.nextToken());

            arr[a][b] = arr[b][a] = 1;
        }

        // dfs
        dfs(start);
        sb.append("\n");
        // visited 새로 초기화
        visited = new boolean[node+1];
        // bfs
        bfs(start);

        System.out.println(sb);
    }
    
    static void bfs(int start) {
        visited[start] = true;
        que.add(start);

        while(!que.isEmpty()){
            start = que.poll();
            sb.append(start+" ");

            for(int i=1; i<=node; i++){
                if(!visited[i] && arr[start][i] == 1){
                    que.add(i);
                    visited[i]= true;
                }
            }
        }
    }
    
    static void dfs(int start) {
        visited[start] = true;
        sb.append(start + " ");

        for(int i=0; i<=node; i++){
            if(!visited[i] && arr[start][i] == 1){
                dfs(i);
            }
        }
    }
}