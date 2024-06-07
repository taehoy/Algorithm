import java.util.*;

class Solution {
    private static String[] separateFilename(String file){
        file = file.toUpperCase();
        
        String header = file.split("[0-9]")[0]; // 헤더
        String number = file.substring(header.length());// 넘버
        
        return new String[]{header, number};
    }
    
    private static String getNumber(String number){
        StringBuilder sb = new StringBuilder();
        
        for(char c : number.toCharArray()){
            if(Character.isDigit(c) && sb.length() <= 5){
                sb.append(c);
            } else {
                return sb.toString();
            }
        }
        
        return sb.toString();
    }
    
    public String[] solution(String[] files) {
        Arrays.sort(files, new Comparator<String>(){
           @Override
            public int compare(String s1, String s2){
                String[] arr1 = separateFilename(s1);
                String[] arr2 = separateFilename(s2);
                
                int result = arr1[0].compareTo(arr2[0]);
                
                // 문자가 같을 경우, 숫자 비교
                if(result == 0){
                    int num1 = Integer.parseInt(getNumber(arr1[1]));
                    int num2 = Integer.parseInt(getNumber(arr2[1]));
                    
                    return num1- num2;
                }
                
                return result;
            }
        });
        
        return files;
    }
}