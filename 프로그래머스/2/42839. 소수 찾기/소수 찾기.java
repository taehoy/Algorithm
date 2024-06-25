import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Solution {
    Set<Integer> numberSet = new HashSet<>();

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution("011"));
    }

    public void recursive(String comb, String others){
        // 1. 빈 문자열이 아닌 경우 처리
        if(!comb.equals("")){
            numberSet.add(Integer.parseInt(comb));
        }

        // 2. recursive호출
        for(int i=0; i<others.length(); i++){
            recursive(comb + others.charAt(i), others.substring(0,i) + others.substring(i+1));
        }
    }

    public int solution(String numbers) {
        // 1. 모든 수의 조합
        recursive("", numbers);

        // 2. 소수 개수 구하기
        int count =0;
        Iterator<Integer> it = numberSet.iterator();
        while(it.hasNext()){
            int num = it.next();
            if(isPrime(num)){
                count++;
            }
        }

        // 3. 소수 개수 출력하기

        return count;
    }

    private boolean isPrime(int num) {
        // 0과 1이면 패스 처리
        if(num == 0 || num == 1)
            return false;

        // limit 계산
        int lim = (int)Math.sqrt(num);

        // 소수 여부 확인
        for(int i=2; i<=lim; i++){
            if(num % i == 0)
                return false;
        }

        return true;
    }
}
