class Solution {
    public int solution(String dartResult) {
        char[] arr = dartResult.toCharArray();
        int[] scores = new int[3];
        int idx = -1;
        
        for(int i=0; i<arr.length; i++){
            if('0' <= arr[i] && arr[i] <= '9'){
                idx++;
                if(arr[i+1] == '0'){
                    scores[idx] = 10;
                    i++;
                    continue;
                }
                scores[idx] = Integer.parseInt(String.valueOf(arr[i]));
                continue;
            }
            switch(arr[i]){
                case 'D' : 
                    scores[idx] = (int)Math.pow(scores[idx], 2);
                    break;
                case 'T' : 
                    scores[idx] = (int)Math.pow(scores[idx], 3);
                    break;
                case '*' : 
                    scores[idx] *= 2;
                    if(idx-1>=0) scores[idx-1] *= 2;
                    break;
                case '#' :
                    scores[idx] *= -1;
                    break;
            }
        }
        
        return scores[0] + scores[1] + scores[2];
    }
}