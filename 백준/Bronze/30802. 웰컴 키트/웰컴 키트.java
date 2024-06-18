import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 참가자수
        int people = Integer.parseInt(br.readLine());

        // 2. 티셔츠계산
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
        // 티셔츠 1묶음당 개수
        int cloth = Integer.parseInt(st2.nextToken());
        int sumCloth = 0; // 출력: 필요한 총 묶음 수

        int size = st.countTokens();
        for(int i=0; i<size; i++){
            int num = Integer.parseInt(st.nextToken());
            if(num % cloth == 0){
                sumCloth += num / cloth;
            } else {
                sumCloth += (num / cloth) + 1;
            }
        }

        sb.append(sumCloth).append("\n");

        // 3. 펜 계산
        int pen = Integer.parseInt(st2.nextToken());

        sb.append(people/pen).append(" ");
        sb.append(people % pen);

        System.out.println(sb);
    }
}
