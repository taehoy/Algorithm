class Solution {
    public String solution(String X, String Y) {

        StringBuilder sb = new StringBuilder();
        
        int[] arrX = new int[10];
        int[] arrY = new int[10];
        
        for(char c : X.toCharArray()){
            int idx = (int)c-'0';
            arrX[idx]++;
        }
        
        for(char c : Y.toCharArray()){
            int idx = (int)c-'0';
            arrY[idx]++;
        }
        
        for(int i=9; i>=0; i--){
            while(arrX[i] >=1  && arrY[i] >= 1){
                sb.append(i);
                arrX[i]--;
                arrY[i]--;
            }
        }
        
        if(sb.length() ==0) return "-1";
        if(sb.toString().charAt(0) == '0') return "0";
        
        return sb.toString();
    }
}