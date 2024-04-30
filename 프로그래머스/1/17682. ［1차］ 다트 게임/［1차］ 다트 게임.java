class Solution {
    public int solution(String dartResult) {
        char[] arr = dartResult.toCharArray();
        
        int[] scores = new int[3];
        int idx = -1; // 점수 배열 인덱스
        
        for(int i=0; i<arr.length; i++){
            // 숫자의 경우 0~9 or 10 따로 처리
            if('0' <= arr[i] && arr[i] <= '9'){
                // 10인 경우
                if(arr[i+1] == '0'){
                    idx++;
                    scores[idx] = 10; // 점수 10점 입력
                    i++; // 10을 넣었으므로 arr의 다다음 인덱스로 이동
                    continue;
                } else {
                    idx++;
                    scores[idx] = Integer.parseInt(String.valueOf(arr[i]));
                    continue;
                }
            }
            
            // 문자일 경우 'D', 'T', '*', '#'
            switch(arr[i]){
                case 'D':
                    scores[idx] = (int)Math.pow(scores[idx], 2);
                    break;
                case 'T':
                    scores[idx] = (int)Math.pow(scores[idx], 3);
                    break;
                case '*':
                    scores[idx] *= 2; // 현재 점수 *2
                    // 이전 점수 *2
                    // 첫번째 라운드에는 이전 점수가 없으므로 조건판단
                    if(idx-1 >= 0){ 
                      scores[idx-1] *= 2;   
                    } 
                    break;
                case '#':
                    scores[idx] *= -1;
                    break;
            }
        }
        
        return scores[0]+scores[1]+scores[2];
    }
}