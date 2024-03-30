class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int size = p.length();
        long pLong = Long.parseLong(p);
        
        for(int i=0; i<=t.length()-size; i++){
            String s = t.substring(i,i+size);
            long sLong = Long.parseLong(s);
            if(sLong <= pLong) answer++;
        }
        
        return answer;
    }
}