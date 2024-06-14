class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        
        int size = p.length();
        long numP = Long.valueOf(p);
        
        for(int i=0; i<t.length()-size+1; i++){
            String s = t.substring(i, i+size);
            
            long n1 = Long.valueOf(s);
            
            if(numP >= n1) answer++;
        }
        
        return answer;
    }
}