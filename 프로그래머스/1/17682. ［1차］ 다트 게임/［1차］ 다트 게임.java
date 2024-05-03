class Solution {
    public int solution(String dartResult) {
        
        int[] scores = new int[3];
        int idx = -1;
        char[] arr = dartResult.toCharArray();
        
        for(int i=0; i<arr.length; i++){
            // 숫자인 경우
            if('0'<=arr[i] && arr[i] <= '9'){
                idx++;
                // 10인 경우
                if(arr[i+1] == '0'){
                    scores[idx] = 10;
                    i++;
                    continue;
                }
                // 0~9인 경우
                scores[idx] = Integer.parseInt(String.valueOf(arr[i]));
                continue;
            }
            
            // 문자인 경우
            if(arr[i] == 'D'){
                scores[idx] = (int)Math.pow(scores[idx], 2);
            } else if(arr[i] == 'T'){
                scores[idx] = (int)Math.pow(scores[idx], 3);
            } else if(arr[i] == '*'){
                scores[idx] *= 2;
                // 첫번째 판이면 전 경기 없으므로 조건처리
                if(idx -1 >= 0) scores[idx-1] *= 2;
            } else if(arr[i] == '#'){
                scores[idx] *= -1;
            }
        }
        
        return scores[0] + scores[1] + scores[2];
    }
}