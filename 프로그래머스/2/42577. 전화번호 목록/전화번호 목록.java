import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        
        Map<String, Integer> phoneMap = new HashMap<>();
        
        for(String s : phone_book){
            phoneMap.put(s, 1);
        }
        
        // 맵에 접두어 여부 처리
        for(int i =0; i<phone_book.length; i++){
            for(int j=0; j<phone_book[i].length(); j++){
                if(phoneMap.containsKey(phone_book[i].substring(0,j))){
                    return false;
                }
            }
        }
        
        return true;
    }
}