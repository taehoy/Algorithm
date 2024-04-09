class Solution {
    public int solution(int n) {
        int cnt = 0;
        String s1 = Integer.toBinaryString(n);
        
        for(int i=0; i<s1.length(); i++){
            if(s1.charAt(i) == '1'){
                cnt++;
            }
        }
        
        while(true){
            int cnt2 = 0;
            n++;
            String s2 = Integer.toBinaryString(n);
            for(int i=0; i<s2.length(); i++){
                if(s2.charAt(i) == '1'){
                    cnt2++;
                }
            }
            if(cnt == cnt2){
                break;
            }
        }

        return n;
    }
}