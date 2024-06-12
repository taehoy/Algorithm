import java.io.*;
import java.util.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		StringTokenizer st = new StringTokenizer(input," ");
		
		int result = 0;
		while(st.hasMoreTokens()){
			result += Integer.parseInt(st.nextToken());
		}
		System.out.println(result);
		
	}
}