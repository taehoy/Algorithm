class Solution {
    public int[] solution(long n) {
        String strN = String.valueOf(n);
        int[] answer = new int[strN.length()];
        String[] strings = strN.split("");
        for(int i=0; i<strings.length/2; i++){
            String temp = strings[i];
            strings[i] = strings[strings.length-1 - i];
            strings[strings.length-1 - i] = temp;
        }
        for(int i=0; i<strings.length; i++){
            answer[i] = Integer.parseInt(strings[i]);
        }

        return answer;
    }
}