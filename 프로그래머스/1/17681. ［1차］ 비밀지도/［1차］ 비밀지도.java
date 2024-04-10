class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[arr1.length];
        
        // arr1, arr2를 이진법으로 변환
        for(int i=0; i<arr1.length; i++){
            answer[i] = Integer.toBinaryString(arr1[i] | arr2[i]);    
            if(answer[i].length() != n) {
                while(answer[i].length() != n){
                    answer[i] = "0" + answer[i];
                }
            }
        }
        
        // 1과 0을 각각 #과 " "치환
        for(int i=0; i<answer.length; i++){
            answer[i] = answer[i].replaceAll("1", "#");
            answer[i] = answer[i].replace("0", " ");
        }

        return answer;
    }
}