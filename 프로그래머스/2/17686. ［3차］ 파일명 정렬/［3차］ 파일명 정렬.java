import java.util.*;

class Solution {
    private static String[] seperateFile(String file){
        file = file.toUpperCase();
        
        String head = file.split("[0-9]")[0];
        String number = file.substring(head.length());
        return new String[]{head, number};
    }
    
    private static String validateNumber(String number){
        StringBuilder sb = new StringBuilder();
        
        for(char c : number.toCharArray()){
            if(Character.isDigit(c) && sb.length()<=5){
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
            public int compare(String o1, String o2){
                String[] arr1 = seperateFile(o1);
                String[] arr2 = seperateFile(o2);
                
                int result = arr1[0].compareTo(arr2[0]);
                
                if(result ==0){
                    int num1 = Integer.parseInt(validateNumber(arr1[1]));
                    int num2 = Integer.parseInt(validateNumber(arr2[1]));
                    
                    return num1-num2;
                }
                
                return result;
            }
        });
        
        return files;
    }
}