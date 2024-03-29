class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int size = p.length();
        
        for(int i =0; i<t.length()-size+1; i++){
            String s = t.substring(i,size+i);
            if(Long.parseLong(s) <= Long.parseLong(p)) answer++;
        }
        
        return answer;
    }
}