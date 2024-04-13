class Solution {
    boolean solution(String s) {
        String lowerS = s.toLowerCase();
        int pNum = 0;
        int yNum = 0;
        

        if(s.contains("p") || s.contains("y")){
            String[] strings = lowerS.split("");
            for (String string : strings) {
                if(string.equals("p"))
                    pNum++;
                if(string.equals("y"))
                    yNum++;
            }
        }
        if(pNum != yNum)
            return false;
        return true;
    }
}