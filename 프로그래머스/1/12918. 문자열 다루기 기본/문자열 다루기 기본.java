class Solution {
    public boolean solution(String s) {
        // 1.char 배열 생성
        char[] ch = s.toCharArray();
        boolean[] bool = new boolean[6];
        
        // s 길이 4 또는 6이 아니면 false 반환
        if(ch.length == 4 || ch.length == 6){
            for(int i=0; i<ch.length; i++) {
                if(65 <= ch[i] && ch[i] <= 122){
                    bool[i] = false;
                } else {
                    bool[i] = true;
                }
            }
        }
        
        for(int i=0; i<ch.length; i++){
            if(bool[i] == false){
                return false;
            }
        }
        return true;
        
    }
}