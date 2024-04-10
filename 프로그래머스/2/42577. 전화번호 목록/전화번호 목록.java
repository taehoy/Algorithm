import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        
        // 배열을 오름차순 정렬한다.
        Arrays.sort(phone_book);
        
        // 배열을 순회하면서 시작 글자가 일치한지 확인한다.
        for(int i=0; i<phone_book.length-1; i++){
            if(phone_book[i+1].startsWith(phone_book[i])){
                return false;
            }
        }
        
        return answer;
    }
}