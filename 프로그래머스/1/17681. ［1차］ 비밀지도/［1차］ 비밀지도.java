class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[arr1.length];
        
        for(int i=0; i<arr1.length; i++){
            answer[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
            if(answer[i].length() != n){
                while(answer[i].length() != n){
                    answer[i] = "0" + answer[i];
                }
            }
        }
        
        for(int i=0; i<answer.length; i++){
            answer[i] = answer[i].replace("0", " ");
            answer[i] = answer[i].replace("1", "#");
        }
        
        return answer;
    }
}