import java.util.*;

class Solution {
    private static int getMinute(String time){
        String[] arr = time.split(":");
        int timeToMinute = Integer.parseInt(arr[0]) * 60;
        return timeToMinute + Integer.parseInt(arr[1]);
    }
    
    
    public int[] solution(int[] fees, String[] records) {
        Map<String, Integer> inMap = new HashMap<>();
        Map<String, Integer> map = new HashMap<>();
        
        for(String record : records){
            String[] arr = record.split(" ");
            int time = getMinute(arr[0]);
            String carNum = arr[1];
            String status = arr[2];
            
            if(status.equals("IN")){
                inMap.put(carNum, time);
            } else if(status.equals("OUT")){
                int inTime = inMap.get(carNum);
                inMap.remove(carNum);
                
                if(map.containsKey(carNum)){
                    int t = map.get(carNum);
                    map.replace(carNum, t + time - inTime);
                } else {
                    map.put(carNum, time - inTime);
                }
            }
        }
        
        // 출차가 없는 경우 처리
        int lastTime = 1439;
        for(String car : inMap.keySet()){
            int time = inMap.get(car);
            if(map.containsKey(car)){
                int t = map.get(car);
                map.replace(car, lastTime + t - time);
            } else {
                map.put(car, lastTime - time);
            }
        }
        
        // 요금 계산
        int baseTime = fees[0];
        int baseFee = fees[1];
        int partTime = fees[2];
        int partFee = fees[3];
        
        Object[] keys = map.keySet().toArray();
        Arrays.sort(keys);
        
        int[] answer = new int[keys.length];
        
        for(int i=0; i<answer.length; i++){
            int result = baseFee;
            
            if(baseTime < map.get(keys[i])){
                result = (int)(baseFee + Math.ceil((double)(map.get(keys[i]) - baseTime) / partTime) * partFee);
            }
            
            answer[i] = result;
        }
        
        return answer;
    }
}