class Solution {
    public int solution(String s) {
        int answer = 0; // 분리 개수
        // 단어 일치 수
        int sameWordCnt = 1;
        int diffWordCnt = 0;
        
        // 문자열 -> 문자 배열
        char[] arr = s.toCharArray();       
        char word = arr[0];
        
        if(arr.length == 1) return 1;
        
        for(int i=1; i<arr.length; i++){
            if(word == arr[i]) sameWordCnt++;
            else diffWordCnt++;
            
            // 단어 수가 일치하면 나눈다.
            if(sameWordCnt == diffWordCnt) {
                answer++; // 나눈 횟수 +1
                
                if(i+1 <= arr.length-1){
                    word = arr[i+1]; 
                    continue;
                }
                
                if(i == arr.length-1) break;

            }
            
            if(i == arr.length-1){
                answer++;
            }
            
        }
        return answer;
    }
}