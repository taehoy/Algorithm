class Solution {
    public String solution(int[] food) {
        // 음식을 순서대로 담을 sb 선언
        StringBuilder sb = new StringBuilder();
        
        // food[i]의 수의 절만만큼 sb에 넣는다.
        for(int i=1; i<food.length; i++){
            int count = food[i] / 2;
            sb.append(String.valueOf(i).repeat(count));
        }
        
        // answer에 sb와 0 추가.
        String answer = sb + "0";
        
        // answer에 sb의 reverse 추가
        answer += sb.reverse();

        return answer;
    }
}