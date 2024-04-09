class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        //일단 string[] 배열 strArr1, strArr2 만들기 
        String[] strArr1 = new String[arr1.length];
        String[] strArr2 = new String[arr2.length];
        
        for(int i=0; i<arr1.length; i++){
            strArr1[i] = Integer.toBinaryString(arr1[i]);
            strArr2[i] = Integer.toBinaryString(arr2[i]);
            
            while(strArr1[i].length() < n){
                strArr1[i] = "0" + strArr1[i];
            }
            while(strArr2[i].length() < n){
                strArr2[i] = "0" + strArr2[i];
            }
        }
        
        // for(String s : strArr1){
        //     System.out.println("strArr1 : " + s + ", length : " + s.length());
        // }
        // for(String s : strArr2){
        //     System.out.println("strArr2 : " + s + ", length : " + s.length());
        // }
        
        // 이진법 값으로 만들기 완료
        
        // strArr1과 strArr2의 이진법 값 비교하기 
        for(int i=0; i<strArr1.length; i++){
            for(int j=0; j<strArr1[i].length(); j++){
                if( (strArr1[i].charAt(j) == '0') && (strArr2[i].charAt(j) == '0')){
                    System.out.print(strArr1[i].charAt(j) + " ");
                    System.out.print(strArr2[i].charAt(j) + "\n");
                    answer[i] += " ";
                } else {
                    answer[i] += "#";
                }
            }
            System.out.println(answer[i]);
            answer[i] = answer[i].substring(4);
        }
        
        return answer;
    }
}