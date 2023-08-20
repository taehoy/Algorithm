import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        Map<String, Integer> nameYearMap = new HashMap<>();
        int[] result = new int[photo.length];
        
        // Map에 값 넣어버리기
        for(int i=0; i<name.length; i++) {
            nameYearMap.put(name[i], yearning[i]);
        }
        
        // photo이름 나온 수만큼 value 더하기
        for(int i=0; i<photo.length; i++) {
            for(int j=0; j<photo[i].length; j++)
                if(nameYearMap.containsKey(photo[i][j])) {
                    result[i] += nameYearMap.get(photo[i][j]);    
                } else
                    result[i] = result[i];
        }
        return result;
    }
}