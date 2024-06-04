public class Main {
    public static void main(String[] args) {
        boolean[] check = new boolean[10001];

        for(int i=1; i<10001; i++){
            if(selfNum(i) < 10001){
                check[selfNum(i)] = true;
            }
        }

        StringBuilder sb = new StringBuilder();

        for(int i=1; i<10001; i++){
            if(!check[i]){
                sb.append(i).append("\n");
            }
        }
        System.out.println(sb);
    }

    private static int selfNum(int num){
        int sum = num;

        while(num != 0){
            sum += num % 10;
            num /= 10;
        }

        return sum;
    }
}
