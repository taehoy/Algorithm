import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        List<String> list = new ArrayList<>();
        
        if(cacheSize ==0) return cities.length * 5;
        
        // 리스트에 도시 있는경우
        for(String s : cities){
            s = s.toLowerCase();
            
            if(list.contains(s)){
                list.remove(s);
                list.add(s);
                answer++;
            }
            // 리스트에 도시 없는 경우
            else {
                // 캐시 크기가 초과되는 경우
                if(list.size() == cacheSize){
                    list.remove(0);
                }
                // 추가
                list.add(s);
                answer += 5;
            }
        }
        return answer;
    }
}