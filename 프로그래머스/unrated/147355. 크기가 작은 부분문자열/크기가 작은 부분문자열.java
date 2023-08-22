class Solution {
    public int solution(String t, String p) {
        int sizeOfP = p.length();
        long NumberOfP = Long.parseLong(p);

        int count = 0;
        
        for(int i=0; i< t.length() - sizeOfP + 1; i++) {
            long temp = Long.parseLong(t.substring(i,i+sizeOfP));
            if(temp <= NumberOfP) count++;
        }
        
        //4. Int값 < P값 or Int값 == P값 이면 count +1
        return count;
    }
}