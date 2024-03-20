class Solution {
    public String solution(String s) {
        char[] ch = s.toCharArray();
        for(int j =0; j<ch.length-1; j++) {
            for(int i =0; i< ch.length -1; i++){
                if(ch[i] < ch[i+1]) {
                    char temp = ch[i];
                    ch[i] = ch[i+1];
                    ch[i+1] = temp;
                }
            }
        }
        return String.valueOf(ch);
    }
}