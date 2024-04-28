class Solution {
    public int solution(int n) {
        int count = 0;

        // 1씩 증가하면서 조건 3개를 맞춰야 한다.
        String s1 = Integer.toBinaryString(n);        

        for(int i=0; i<s1.length(); i++){
            if(s1.charAt(i) == '1'){
                count++;
            };
        }
        
        while(true){
            int count1 = 0;
            
            n++;

            String s2 = Integer.toBinaryString(n);        

            for(int i=0; i<s2.length(); i++){
                if(s2.charAt(i) == '1'){
                    count1++;
                };
            }

            if(count1 == count) 
                break;
        }
       
        return n;
    }
}