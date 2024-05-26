import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String[] strArr = new String[numbers.length];
        
        for(int i=0; i<numbers.length; i++){
            strArr[i] = String.valueOf(numbers[i]);
        }
        
//         Arrays.sort(strArr, new Comparator<String>(){
//             public int compare(String s1, String s2){
//                 return (s2+s1).compareTo(s1+s2);
//             }
//         });
        
        Arrays.sort(strArr, (a,b) -> (b+a).compareTo(a+b));
        
        if(strArr[0].equals("0")) return "0";
        
        StringBuilder sb = new StringBuilder();
        
        for(String s : strArr){
            sb.append(s);
        }
            
        return sb.toString();
    }
}