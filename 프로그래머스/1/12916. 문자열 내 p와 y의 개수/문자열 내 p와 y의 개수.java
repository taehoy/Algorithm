class Solution {
    boolean solution(String s) {
        int pCnt = 0;
        int yCnt = 0;
        
        s = s.toLowerCase();
        
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            
            
            if(c=='p') pCnt++;
            else if(c=='y') yCnt++;
        }
       
        if(pCnt == yCnt || (pCnt ==0 && yCnt==0)) return true;
        
        return false;
    }
}