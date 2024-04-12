class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int subLength = p.length();
        long p1 = Long.parseLong(p);
        
        for(int i=0; i<t.length()-subLength+1; i++){
            // p의 길이만큼의 부분문자열을 구한다.
            long subLong = Long.parseLong(t.substring(0+i, subLength+i));
            if(subLong <= p1) answer++;
        }
        
        return answer;
    }
}