import java.util.*;

class Solution {
    public int solution(String str1, String str2) {
        // 대문자 만들기
        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();
        
        int answer = 0; // 자카드 유사도 (0~1)
        
        // 다중집합 만들기
        List<String> list1 = new ArrayList<>(); // 다중집합 A
        List<String> list2 = new ArrayList<>(); // 다중집합 B
        
        for(int i=0; i<str1.length()-1; i++){
            char c1 = str1.charAt(i);
            char c2 = str1.charAt(i+1);
            
            if(('A'<= c1 && c1 <='Z') && ('A' <= c2 && c2 <= 'Z')){
                list1.add(String.valueOf(c1) + String.valueOf(c2));
            }
        }

        for(int i=0; i<str2.length()-1; i++){
            char c1 = str2.charAt(i);
            char c2 = str2.charAt(i+1);
            
            if(('A'<= c1 && c1 <='Z') && ('A' <= c2 && c2 <= 'Z')){
                list2.add(String.valueOf(c1) + String.valueOf(c2));
            }
        }
        
        // 자카드 유사도 구하기
        // 공집합 합집합
        List<String> inter = new ArrayList<>();
        List<String> union = new ArrayList<>();
        for(String s : list1){
            if(list2.remove(s)){
                inter.add(s);
            }
            union.add(s);
        }
        
        union.addAll(list2);
        System.out.println(list1);
        System.out.println(list2);
        
        double temp = (double)inter.size() / (double)union.size();
        temp = temp * 65536;
        
        if(union.size() == 0){
            return 65536;
        }
        
        answer = (int)temp;
        
        return answer;
            
    }
}