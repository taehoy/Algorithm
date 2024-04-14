class Solution {
    
    public String solution(int a, int b) {
        // 요일과 월별날짜 배열 만들기
        int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] week = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        
        int day = 0;
        // 주어진 날짜에 해당하는 일수 구하기
        for(int i=0; i<a-1; i++){
            day += month[i];
        }
        
        day = day + b;
        // 총 일수와 요일 배열을 이용해서 해당 요일 찾기
        int num = day % 7;
        
        if(num % 7 == 0) return week[4];
        else if(num % 7 == 1) return week[5];
        else if(num % 7 == 2) return week[6];
        else if(num % 7 == 3) return week[0];
        else if(num % 7 == 4) return week[1];
        else if(num % 7 == 5) return week[2];
        else return week[3];
        
    }
}