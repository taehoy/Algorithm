class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        boolean[] check = new boolean[n];
        
        for(int i=0; i<section.length; i++){
            check[section[i]-1] = true;
        }
        
        for(int i=0; i<check.length; i++){
            if(check.length - m <= i) {
                if(check[i]){
                    answer ++;
                    return answer;
                }
            }
            
            if(check[i]){
                for(int j=0; j<m; j++){
                    check[i+j] = false;
                }
                answer++; 
            }
            
            
        }
        
        return answer;
    }
}