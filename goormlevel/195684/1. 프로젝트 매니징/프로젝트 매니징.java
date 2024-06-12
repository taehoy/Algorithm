import java.io.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		int N = Integer.parseInt(input);
		
		String input2 = br.readLine();
		String[] arr = input2.split(" ");
		
		int T = Integer.parseInt(arr[0]);
		int M = Integer.parseInt(arr[1]);
		
		// 처음 시간 구하기
		// 시 : 분  -> 분
		int minute = T * 60 + M;
		
		// 이후시간
		for(int i=0; i<N; i++){
			int time = Integer.parseInt(br.readLine());
			
			minute += time;
			// 23: 59 넘어가면 리셋
			if(minute >= 1440){
				minute = minute % 1440;
			}
		}
		
		// 이후시간 (분) -> 시 : 분 
		int hour = minute / 60;
		int mm = minute % 60;
		
		System.out.printf("%d %d", hour, mm);
	}
}