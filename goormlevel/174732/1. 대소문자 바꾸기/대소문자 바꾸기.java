import java.io.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String s = br.readLine();
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<n; i++){
			char c = s.charAt(i);
			
			if('a' <= c && c <= 'z') sb.append(s.substring(i,i+1).toUpperCase());
			else sb.append(s.substring(i,i+1).toLowerCase());
		}
		
		System.out.println(sb);
	}
}