import java.io.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int result = 0; // 문자 개수
		
		
		// 문자열 수정
		input = input.trim();		// 처음, 마지막 공백 제거
		
		String[] arr = input.split(" ");	// 문자열 나누기
		
		for(String s : arr){
			if(!s.equals("")) result++;
		}
		
		System.out.println(result);
	}
}