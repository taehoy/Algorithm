import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] clearStages = new int[N+1];
        int[] currentStages = new int[N+1];
        
        // 클리어한 사람 , 클리어 못한 사람 추가하기
        for(int i=0; i<stages.length; i++){
            for(int j=0; j<stages[i]; j++){
                clearStages[j]++;
            }
            currentStages[stages[i]-1]++;
        }
        
        // 실패율 map 만들기
        Map<Integer, Double> map = new HashMap<>();
        
        for(int i=0; i<N; i++){
            if(clearStages[i] == 0 || currentStages[i] == 0){
                map.put(i+1, 0.0);
            } else {
                map.put(i+1, (double)currentStages[i] / (double)clearStages[i]);
            }
        }
        
        // 스테이지 리스트 만들기
        List<Integer> list = new ArrayList<>(map.keySet()); // 1,2,3,4,5
        
        list.sort((o1,o2) -> Double.compare(map.get(o2), map.get(o1)));
        // 리스트 -> 배열
        return list.stream().mapToInt(i -> i).toArray();
    }
}