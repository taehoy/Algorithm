class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        int x = -1; // 시작 지점 및 최종위치
        int y = -1; // 시작 지점 및 최종위치
        int height = park.length; // 공원 세로
        int weight = park[0].length(); // 공원 가로
        
        //시작 지점 찾기
        for(int i=0; i<park.length; i++){
            if(park[i].indexOf('S') != -1){
                x = park[i].indexOf('S');
                y = i;
                break;
            }
        }
        
        
        // 로봇 이동
        for(int i=0; i<routes.length; i++){
            String[] temp = routes[i].split(" ");
            String vector = temp[0]; // 방향
            int distance = Integer.parseInt(temp[1]);
            int currX = x; // 현재 위치 x
            int currY = y; // 현재 위치 y
            
            if(vector.equals("E")){
                boolean flag = true;
                for(int j=1; j<=distance; j++){
                    currX++;
                    
                    // 공원 넘어가는가
                    if(currX >= weight){
                        flag = false;
                        break;
                    } else if(park[currY].charAt(currX) == 'X'){
                        flag = false;
                        break;
                    }
                }

                if(flag){
                    x = currX;
                }
            } else if(vector.equals("W")){
                boolean flag = true;
                for(int j=1; j<=distance; j++){
                    currX--;
                    
                    // 공원 넘어가는가
                    if(currX < 0){
                        flag = false;
                        break;
                    }else if(park[currY].charAt(currX) == 'X'){
                        flag = false;
                        break;
                    }
                }
                
                if(flag){
                    x = currX;
                }
            } else if(vector.equals("S")){
                boolean flag = true;
                for(int j=1; j<=distance; j++){
                    currY++;
                    
                    // 공원 넘어가는가
                    if(currY >= height){
                        flag = false;
                        break;
                    } else if(park[currY].charAt(currX) == 'X'){
                        flag = false;
                        break;
                    }
                }
                
                if(flag){
                    y = currY;
                }
            } else if(vector.equals("N")){
                boolean flag = true;
                for(int j=1; j<=distance; j++){
                    currY--;
                    
                    // 공원 넘어가는가
                    if(currY < 0){
                        flag = false;
                        break;
                    } else if(park[currY].charAt(currX) == 'X'){
                        flag = false;
                        break;
                    }
                }
                
                if(flag){
                    y = currY;
                }
            }
        }
        
        answer[0] = y;
        answer[1] = x;
        
        return answer;
    }
}