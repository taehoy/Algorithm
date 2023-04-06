class Solution {
    public int[] solution(int n) {
        // answer의 길이 정하기
        int[] answer = new int[(n+1)/2];
        
        // answer에 홀수값 넣기
        for (int i=1; i<=n; i++) {
            if(i % 2 ==1)
                answer[i/2] = i;
        }
        return answer;
    }
}
