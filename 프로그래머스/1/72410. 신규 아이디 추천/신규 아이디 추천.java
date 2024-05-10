class Solution {
    public String solution(String new_id) {
        String s = new KakaoID(new_id)
                .toLowerCase()
                .filter()       
                .toSingleDot()
                .delFirstEndDot()
                .noBlank()
                .noLonger15()
                .toLongerTwo()
                .getResult();
        
        return s;
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
            StringBuilder sb = new StringBuilder();
            for(int i=0; i<s.length(); i++){
                char c = s.charAt(i);
                
                if(('a' <= c && c <= 'z') || ('0' <= c && c <= '9') || c == '_' || c == '-' || c == '.'){
                    sb.append(c);
                }
            }
            
            s = sb.toString();
            
            return this;
        }       
        
        
        private KakaoID toSingleDot() {
            while(s.contains("..")){
                s = s.replace("..", ".");
            }
            
            return this;
        }
        
        private KakaoID delFirstEndDot(){
            if(s.length() > 0){
                if(s.charAt(0) == '.') s= s.substring(1, s.length());
            }
            if(s.length() > 0){
                if(s.charAt(s.length()-1) == '.') s = s.substring(0, s.length()-1);
            }
            
            return this;
        }
        
        
        private KakaoID noBlank(){
            if(s.equals("")) s = "a";
                
            return this;
        }
        
        
        private KakaoID noLonger15(){
            if(s.length() >= 16) {
                s = s.substring(0,15);
            }
            if(s.charAt(s.length()-1) == '.'){
                    s = s.substring(0,14);
                }
            
            return this;
        }
        
        private KakaoID toLongerTwo() {
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