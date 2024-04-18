import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        String str = br.readLine();
        
        // a ~ z까지 순회
        for(char c = 'a'; c <= 'z'; c++){
            //indexOf이용하여 인덱스 위치 설정 
            sb.append(str.indexOf(c) + " ");
        }
        System.out.println(sb);
    }
}