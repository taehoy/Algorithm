class Solution {
    public String solution(String new_id) {
        String kakaoID = new KakaoID(new_id)
                        .toLowerCase()
                        .filter()
                        .toSingleDot()
                        .removeFirstOrEndDot()      
                        .checkLength()
                        .tolessThan16()
                        .checkLength2()
                        .getResult();
        
        System.out.println(kakaoID);
        
        return kakaoID;
    }
    
    private static class KakaoID{
        private String s;
        
        public KakaoID(String new_id){
            this.s = new_id;
        }
        
        private KakaoID toLowerCase(){
            s = s.toLowerCase();
            return this;
        }
        
        private KakaoID filter(){
            char[] arr = s.toCharArray();
            StringBuilder sb = new StringBuilder();
            
            for(char c : arr){
                if(('a' <= c && c <= 'z') || ('0' <= c && c <='9') || c == '-' || c == '_' || c == '.'){
                    sb.append(c);
                }
            }
            this.s = sb.toString();
            
            return this;
        }
        
        private KakaoID toSingleDot(){
            s = s.replace("..", ".");
            while(s.contains("..")){
                s = s.replace("..", ".");
            }
            
            return this;
        }
        
        private KakaoID removeFirstOrEndDot(){
            if(s.length() > 0){
                if(s.charAt(0) == '.') s = s.substring(1,s.length());
            }
            if(s.length() > 0){
                if(s.charAt(s.length()-1) == '.') s = s.substring(0,s.length()-1);
            }
            
            return this;
        }
        
        private KakaoID checkLength(){
            s = s.equals("") ? "a" : s;
            return this;
        }
        
        private KakaoID tolessThan16(){
            if(s.length() >= 16){
                s = s.substring(0,15);
            }
            if(s.charAt(s.length()-1)== '.') s = s.substring(0,14);
            
            return this;
        }
        
        private KakaoID checkLength2(){
            StringBuilder sb = new StringBuilder(s);
            
            if(sb.length() <= 2){
                while(sb.length() != 3){
                    sb.append(s.charAt(s.length()-1));
                }
            }
            s = sb.toString();
            
            return this;
        }
        
        
        private String getResult(){
            return s;
        }
        
        
        
    }
}