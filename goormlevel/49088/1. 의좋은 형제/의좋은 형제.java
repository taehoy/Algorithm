import java.io.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String[] arr = input.split(" ");
		
		// 개수 구하기
		int n1 = Integer.parseInt(arr[0]);
		int n2 = Integer.parseInt(arr[1]);
		
		// 알고 싶은 날 D 구하기
		String input2 = br.readLine();
		int D = Integer.parseInt(input2);
		
		// n번째 날까지 식량 교환하기
		// 날짜 계산 변수
		int i = 1;
		while(i <= D){
			// 식량 나누기
			// 홀수면 진우가 선우한테 준다.
			if(i % 2 == 1){
				if(n1 % 2 == 1){ // 홀수
					n2 += n1 / 2 + 1;
					n1 -= n1 / 2 + 1;
				} else {
					n2 += (n1 / 2);
					n1 -= n1 / 2;
				}
			// 짝수면 선우 -> 진우
			} else { 
				if(n2 % 2 == 1){ // 홀수
					n1 += n2 / 2 + 1;
					n2 -= n2 / 2 + 1;
				} else {
					n1 += (n2 / 2);
					n2 -= (n2 / 2);
				}
			}
			i++;
		}
		
		System.out.print(n1 + " " + n2);
	}
}