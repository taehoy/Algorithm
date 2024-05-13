class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder sb = new StringBuilder();
        
        for(char c : s.toCharArray()){
            int count = 0;
            
            while(count != index){
                c = (c == 'z') ? 'a' : (char)(c + 1);
                
                if(!skip.contains(String.valueOf(c))){
                    count++;
                }
            }
            
            sb.append(c);
        }
        
        return sb.toString();
    }
}