class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        int[] scores = new int[3]; // 점수배열
        int idx = -1; // 점수 배열 인덱스
        
        char[] arr = dartResult.toCharArray();
        
        for(int i=0; i<arr.length; i++){
            // 숫자일 경우
            if('0' <= arr[i] && arr[i] <= '9'){
                if(arr[i+1] == '0'){
                    idx++; // 숫자면 idx ++
                    scores[idx] = 10; 
                    i++; // 10이므로 다음 idx jump
                    continue;
                } else {
                    idx++;
                    scores[idx] = Integer.parseInt(String.valueOf(arr[i]));
                    continue;
                }
            }
            // 문자일 경우
            switch(arr[i]) {
                case 'D' :
                    scores[idx] = (int)Math.pow(scores[idx], 2);
                    break;
                case 'T' :
                    scores[idx] = (int)Math.pow(scores[idx], 3);
                    break;
                case '*' :
                    scores[idx] *= 2;
                    if(idx-1 >=0) scores[idx-1] *= 2;
                    break;
                case '#' :
                    scores[idx] *= -1;
                    break;
            }
        }
        
        return scores[0] + scores[1] + scores[2];
    }
}