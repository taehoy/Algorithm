import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 입력값 받기
        int count = Integer.parseInt(br.readLine());
        int size = 4 * count - 3;
        char[][] arr = new char[size][size];
        int idx = 0;

        // 격자 배열 만들기
        for(int i=0; i<count; i++){
            for(int j=idx; j<size-idx; j++){
                arr[idx][j] = '*';//맨 윗줄
                arr[size-idx-1][j] = '*';//맨 아랫줄
                arr[j][idx] = '*'; //왼쪽 줄
                arr[j][size-idx-1] = '*'; //오른쪽 줄
            }
            idx += 2;
        }

        // 배열 출력하기
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                if(arr[i][j] == '*'){
                    bw.write('*');
                } else {
                    bw.write(' ');
                }
            }
            bw.write("\n");
        }
        bw.close();
    }
}
