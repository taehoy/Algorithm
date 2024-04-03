class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        long pLong = Long.parseLong(p);
        
        for(int i=0; i<t.length()-p.length()+1; i++){
            long subLong = Long.parseLong(t.substring(i, i + p.length()));
            if(pLong >= subLong) answer++;
        }
        return answer;
    }
}