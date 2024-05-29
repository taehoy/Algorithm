class Solution {
    public int solution(String dartResult) {
        char[] arr = dartResult.toCharArray();
        int[] scores = new int[3];
        int index = -1;
        
        for(int i=0; i<arr.length; i++){
            if('0' <= arr[i] && arr[i] <= '9'){
                index++;    
                if(arr[i+1] == '0'){
                    scores[index] = 10;
                    i++;
                    continue;
                }
                
                scores[index] = Integer.parseInt(String.valueOf(arr[i]));
            }
            
            
            // 영역, 옵션
            if(arr[i] == 'D'){
                scores[index] = (int)Math.pow(scores[index], 2);
            } else if(arr[i] == 'T'){
                scores[index] = (int)Math.pow(scores[index], 3);
            } else if(arr[i] == '*'){
                scores[index] *= 2;
                if(index-1 >= 0){
                    scores[index-1] *= 2;
                }
            } else if(arr[i] == '#'){
                scores[index] *= -1;
            }
        }
        return scores[0] + scores[1] + scores[2];
    }
}