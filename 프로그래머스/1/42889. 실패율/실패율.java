/*
*   1. 실패율 구하기
*   1.1 머무는 사람 수 구하기
*   1.2 참가자수와 머문 사람 처리
*   
*   
*
*/
import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        
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
        Map<Integer, Double> failPercentMap = new HashMap<>();
        
        for(int i=0; i<N; i++){
            if(clearStages[i] == 0 || currentStages[i] == 0){
                failPercentMap.put(i+1, 0.0);
            } else {
                failPercentMap.put(i+1, (double)currentStages[i] / (double)clearStages[i]);
            }
        }
        
        
        
        List<Double> failPercentList = new ArrayList<>();
        
        for(int i=0; i<failPercentMap.size(); i++){
            failPercentList.add(failPercentMap.get(i+1));
        }
        
        Collections.sort(failPercentList, Collections.reverseOrder());
        
        for(int i=0; i<failPercentList.size(); i++){
            for(Integer stage : failPercentMap.keySet()){
                if(failPercentMap.get(stage) == failPercentList.get(i)){
                    answer[i] = stage;
                    failPercentMap.put(stage, -0.1);
                }
            }
        }
        
        // failPercentList.sort((o1,o2) -> Double.compare(failPercentMap.get(o2), failPercentMap.get(o1)));
        // 리스트 -> 배열
        return answer;
    }
}