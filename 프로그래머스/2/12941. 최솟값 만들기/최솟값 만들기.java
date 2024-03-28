import java.util.*;

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        
        Arrays.sort(A);
        Arrays.sort(B);
        
        // 정렬한 값에서 인덱스 0 부터 곱하기
        for(int i=0; i<A.length; i++){
            answer += A[i] * B[B.length-1-i];
        }
        // 곱한 값을 다 더하면 결과 나옴 
        return answer;
    }
    
    
}