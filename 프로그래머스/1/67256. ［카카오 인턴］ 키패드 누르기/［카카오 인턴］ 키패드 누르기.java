class Solution {
    public String solution(int[] numbers, String hand) {
        StringBuilder sb = new StringBuilder();
        
        //왼손, 오른손 처리
        int left = 10;
        int right = 12;
        
        for(int i=0; i<numbers.length; i++){
            int n = numbers[i];
            
            if(n == 1 || n == 4 || n == 7){
                sb.append("L");
                left = n;
            } else if(n == 3 || n == 6 || n == 9){
                sb.append("R");
                right = n;
            } else if(n == 2 || n == 5 || n == 8 || n == 0){
                if(n == 0) n = 11;
                
                // 왼손거리, 
                int leftDiff = (Math.abs(left - n) / 3) + (Math.abs(left-n) % 3);
                int rightDiff = (Math.abs(right - n) / 3) + (Math.abs(right-n) % 3);
                
                // 거리 같은 경우
                if(leftDiff == rightDiff){
                    if(hand.equals("right")){
                        sb.append("R");
                        right = n;
                    } else {
                        sb.append("L");
                        left = n;
                    }
                }
                // 거리 다른 경우(왼손)
                else if(leftDiff < rightDiff){
                    sb.append("L");
                    left = n;
                } else {
                    sb.append("R");
                    right = n;
                }
            }
        }
        
        return sb.toString();
    }
}