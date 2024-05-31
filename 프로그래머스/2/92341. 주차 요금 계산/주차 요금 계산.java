import java.util.*;

class Solution {
    public static int getMinute(String time){
        String[] timeArr = time.split(":");
        int timeMinute =  Integer.parseInt(timeArr[0]);
        int minute = Integer.parseInt(timeArr[1]);
        
        // 출차 - 입차
        return timeMinute * 60 + minute;
    }
    
    public int[] solution(int[] fees, String[] records) {
        
        Map<String, Integer> inParkMap = new HashMap<>();
        Map<String, Integer> map = new HashMap<>();
        
        for(String record : records){
            String[] arr = record.split(" ");
            int time = getMinute(arr[0]);
            String carNum = arr[1];
            String status = arr[2];
            
            if(status.equals("IN")){
                inParkMap.put(carNum, time);
                continue;
            } else if(status.equals("OUT")){
                int inParkTime = inParkMap.get(carNum);
                inParkMap.remove(carNum);
                
                if(map.containsKey(carNum)){
                    int carTime = map.get(carNum);
                    map.replace(carNum, carTime + time - inParkTime);
                } else {
                    map.put(carNum, time-inParkTime);
                }
            }
            
            
            
        }
        
        // 출차가 없는 경우
        int lastTime = 1439;
        for(String car : inParkMap.keySet()){
            int inParkTime = inParkMap.get(car);

            if(map.containsKey(car)){
                int carTime = map.get(car);
                map.replace(car, carTime + lastTime - inParkTime);
            } else {
                map.put(car, lastTime - inParkTime);
            }
        }

        // 요금 계산 (차량번호 오름차순)
        int baseTime = fees[0];
        int baseFee = fees[1];
        int partTime = fees[2];
        int partFee = fees[3];

        Object[] sortKey = map.keySet().toArray();
        Arrays.sort(sortKey);

        int[] answer = new int[sortKey.length];

        for(int i=0; i<sortKey.length; i++){
            int result = baseFee;

            // 누적주차시간 > 기본 시간
            int totalTime = map.get(sortKey[i]);
            if(totalTime > baseTime){
                result = (int)(baseFee + Math.ceil((double)(totalTime - baseTime) / partTime) * partFee);
            }

            answer[i] = result;
        }

        return answer;
    }
}