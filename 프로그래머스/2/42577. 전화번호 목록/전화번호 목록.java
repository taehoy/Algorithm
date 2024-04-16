import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        
        // map 만든다.
        Map<String, Integer> map = new HashMap<>();
        
        // map에 전화번호 넣는다.
        for(String s : phone_book){
            map.put(s, 1);
        }
        
        // 전화번호부의 원소마다 한글자씩 늘리면서 전화번호가 있는지 확인한다.
        for(int i=0; i<phone_book.length; i++){
            for(int j=0; j<phone_book[i].length(); j++){
                if(map.containsKey(phone_book[i].substring(0,j))){
                    return false;
                }
            }
        }
        
        return answer;
    }
}