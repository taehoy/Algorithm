import java.util.*;

class Solution {
    private static int getMinute(String time){
        String[] arr = time.split(":");
        int hourToMinute = Integer.parseInt(arr[0]) * 60;
        int minute = Integer.parseInt(arr[1]);
        
        return hourToMinute + minute;
    }
    
    public int[] solution(int[] fees, String[] records) {
        Map<String, Integer> inMap = new HashMap<>();
        Map<String, Integer> sumMap = new HashMap<>();
        
        for(String record : records){
            String[] arr = record.split(" ");
            int time = getMinute(arr[0]);
            String car = arr[1];
            String status = arr[2];
            
            if(status.equals("IN")) inMap.put(car,time);
            else if(status.equals("OUT")){
                int inTime = inMap.get(car);
                inMap.remove(car);
                
                if(sumMap.containsKey(car)){
                    int sumTime = sumMap.get(car);
                    sumMap.replace(car, sumTime+time - inTime);
                } else {
                    sumMap.put(car, time - inTime);
                }
            }
        }
        
        // 출차가 없는 경우
        int lastTime = 1439;
        for(String car : inMap.keySet()){
            int inTime = inMap.get(car);
            
            if(sumMap.containsKey(car)){
                int sumTime = sumMap.get(car);
                sumMap.replace(car, sumTime + lastTime - inTime);
            } else {
                sumMap.put(car, lastTime - inTime);
            }
        }
        
        // 요금 계산
        int baseTime = fees[0];
        int baseFee = fees[1];
        int partTime = fees[2];
        int partFee = fees[3];
        
        Object[] keys = sumMap.keySet().toArray();
        Arrays.sort(keys);
        
        int[] answer = new int[keys.length];
        
        for(int i=0; i<answer.length; i++){
            int result = baseFee;
            int totalTime = sumMap.get(keys[i]);
            
            if(totalTime > baseTime)
                result = (int)(baseFee+Math.ceil((double)(totalTime - baseTime) / partTime) * partFee);
            
            answer[i] = result;
        }
        return answer;
    }
}