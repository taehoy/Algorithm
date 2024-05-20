/*
* 1. 전화번호부를 만든다.
*
* 2. 접두어의 존재 여부를 확인한다.
*/
import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        Map<String,Integer> phoneMap = new HashMap<>();     
        
        for(String s : phone_book){
            phoneMap.put(s, 1);
        }
        
        for(int i=0; i<phone_book.length; i++){
            for(int j=0;j<phone_book[i].length(); j++){
                if(phoneMap.containsKey(phone_book[i].substring(0,j))){
                    return false;
                }
            }
        }
        return true;        
    }
}