class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        
        char[] arr = dartResult.toCharArray();
        int[] scores = new int[3];
        int idx = -1;
        
        for(int i=0; i<arr.length; i++){
            if('0' <= arr[i] && arr[i] <= '9'){
                idx++;
                if(arr[i+1] == '0'){
                    i++;
                    scores[idx] = 10;
                    continue;
                }
                scores[idx] = Integer.parseInt(String.valueOf(arr[i]));
            }
            
            if(arr[i] == 'D') scores[idx] = (int)Math.pow(scores[idx], 2);
            else if(arr[i] == 'T') scores[idx] = (int)Math.pow(scores[idx], 3);
            else if(arr[i] == '*'){
                scores[idx] *= 2;
                if(idx-1 >= 0){
                    scores[idx-1] *= 2;
                }
            }
            else if(arr[i] == '#') scores[idx] *= -1;
            
        }
        
        return scores[0] + scores[1] + scores[2];
    }
}