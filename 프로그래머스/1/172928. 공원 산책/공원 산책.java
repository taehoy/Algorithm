class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        
        int x = -1; // 시작위치 및 로봇위치
        int y = -1; // 시작위치 및 로봇위치
        
        int weight = park[0].length(); // 가로
        int height = park.length; // 세로
        
        // 시작 위치 지정
        for(int i=0; i<park.length; i++){
            if(park[i].indexOf('S') != -1){
                x = park[i].indexOf('S');
                y = i;
            }
        }
        
        // 로봇 이동
        for(int i=0; i<routes.length; i++){
            int currX = x;
            int currY = y;
            String[] strArr = routes[i].split(" ");
            String vector = strArr[0];
            int distance = Integer.parseInt(strArr[1]);
            
            if(vector.equals("N")){
                
                boolean flag = true;
                
                for(int j=0; j<distance; j++){
                    currY--;
                    
                    if(currY < 0){
                        flag = false;
                        break;
                    } else if(park[currY].charAt(currX) == 'X'){
                        flag = false;
                        break;
                    }
                }
                
                if(flag) y = currY;
                
            } else if(vector.equals("S")){
                boolean flag = true;
                
                for(int j=0; j<distance; j++){
                    currY++;
                    
                    if(currY >= height){
                        flag = false;
                        break;
                    } else if(park[currY].charAt(currX) == 'X'){
                        flag = false;
                        break;
                    }
                }
                
                if(flag) y = currY;
            } else if(vector.equals("W")){
               boolean flag = true;
                
                for(int j=0; j<distance; j++){
                    currX--;
                    
                    if(currX < 0){
                        flag = false;
                        break;
                    } else if(park[currY].charAt(currX) == 'X'){
                        flag = false;
                        break;
                    }
                }
                
                if(flag) x = currX;
            } if(vector.equals("E")){
                boolean flag = true;
                
                for(int j=0; j<distance; j++){
                    currX++;
                    
                    if(currX >= weight){
                        flag = false;
                        break;
                    } else if(park[currY].charAt(currX) == 'X'){
                        flag = false;
                        break;
                    }
                }
                
                if(flag) x = currX;
            }
            
        }
        
        answer[0] = y;
        answer[1] = x;
        
        return answer;
    }
}