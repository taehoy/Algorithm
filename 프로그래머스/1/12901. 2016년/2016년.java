class Solution {
    public String solution(int a, int b) {
        int day = 0;
        
        int[] monthDays = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] week = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        
        // 일 구하기
        for(int i=0; i<a; i++){
            day += monthDays[i];
        }
        
        day += (b-1);
        
        return week[day % 7];
    }
}