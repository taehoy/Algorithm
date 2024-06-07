class Solution {
    public int solution(String s) {
        int answer = s.length();
        
        
        for(int i=1; i<=s.length()/2; i++){
            StringBuilder sb = new StringBuilder();
            String zipStr = s.substring(0,i);
            int zipLength = 1;
            
            for(int j=i; j<=s.length(); j+=i){
                String nextStr = s.substring(j, (j+i) > s.length() ? s.length() : j+i);
                
                // 다음 문자와 압축 문자가 같으면 압축 횟수 증가
                if(zipStr.equals(nextStr)) zipLength++;
                else{
                    sb.append(((zipLength != 1) ? zipLength : "") + zipStr);
                    zipLength = 1;
                    zipStr = nextStr;
                }
            }
            
            sb.append(zipStr);
            
            answer = Math.min(answer, sb.length());
        }
        return answer;
        
    }
}