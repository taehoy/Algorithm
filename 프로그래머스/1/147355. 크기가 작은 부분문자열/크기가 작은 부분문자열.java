class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        
        int size = p.length();
        
        long pNum = Long.parseLong(p);
        
        for(int i=0; i<t.length()-size+1; i++){
            // 부분 문자열
            String sub = t.substring(i, i+size);
            
            if(Long.parseLong(sub) <= pNum) answer++;
        }
        
        return answer;
    }
}