class Solution {
    boolean solution(String s) {
        String[] arr = s.split("");
        
        int openCount = 0;
        int closeCount = 0;
        
        for(String ss : arr){
            if(ss.contains("(")){
                openCount++;
            } else {
                closeCount++;
            }
            if(openCount < closeCount){
                return false;
            }
        }
        
        if(openCount == closeCount){
            return true;
        }

        return false;
    }
}