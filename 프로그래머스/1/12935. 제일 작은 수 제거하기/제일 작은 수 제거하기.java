class Solution {
    public int[] solution(int[] arr) {
        if(arr.length == 1){
            arr[0] = -1;
            return arr;
        }
        
        int[] answer = new int[arr.length-1];

        int min = arr[0];
        
        for(int i=1; i < arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        
        int index = 0; // answer 인덱스 증가용
        
        // 최소값을 뺀 나머지를 answer 배열에 넣기
        for(int i = 0; i < arr.length; i++){
            if(min == arr[i]){
                continue;
            }
            
            answer[index++] = arr[i];
        }
        
        return answer;
    }
}