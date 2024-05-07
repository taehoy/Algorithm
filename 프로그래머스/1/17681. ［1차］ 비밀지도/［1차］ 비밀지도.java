class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        // 두 지도 원소 비교
        for(int i=0; i<arr1.length; i++){
            answer[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
            
            while(answer[i].length() != n){
                answer[i] = "0" + answer[i];
            }
            
            answer[i] = answer[i].replace("1","#");
            answer[i] = answer[i].replace("0"," ");
        }
        
        return answer;
    }
}