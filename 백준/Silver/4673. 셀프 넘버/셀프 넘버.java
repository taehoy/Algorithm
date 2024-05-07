public class Main {

    public static void main(String[] args) {

        // 체크배열 생성
        boolean[] check = new boolean[10001];

        // 1~10000까지 순회
        for(int i=1; i<10001; i++){
            int n = d(i);

            // n이 10000 초과는 의미 없음
            if(n < 10001){
                check[n] = true;
            }
        }

        // 생성자 x 숫자 출력
        StringBuilder sb = new StringBuilder();

        for(int i=1; i<10001; i++){
            if(check[i] == false){
                sb.append(i).append("\n");
            }
        }

        System.out.println(sb);

    }

    public static int d(int n){
        int sum = n;

        while(n != 0){
            sum += n % 10;
            n = n/10;
        }

        return sum;
    }
}
