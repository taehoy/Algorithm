import java.util.*;

class Solution {
    public void insertKey(Map<String, Integer> phoneMap, String[] phone_book){
        for(String s : phone_book){
            phoneMap.put(s, 1);
        }
        
    }
    
    public boolean isStartSubStr(Map<String, Integer> phoneMap, String[] phone_book){
        for(int i=0; i<phone_book.length; i++){
            for(int j=0; j<phone_book[i].length(); j++){
                // key 존재하면 접두어 o
                if(phoneMap.containsKey(phone_book[i].substring(0,j))){
                    return false;
                }
            }
        }
        
        return true;
        
    }
    
    public boolean solution(String[] phone_book) {
        Map<String, Integer> phoneMap = new HashMap<>();
        
        insertKey(phoneMap, phone_book);

        // 접두어 존재 여부 처리
        return isStartSubStr(phoneMap, phone_book);
    }
}