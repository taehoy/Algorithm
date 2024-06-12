import java.io.*;
import java.util.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(input);
		// 가장 큰 수 인덱스 찾기
		String input2 = br.readLine();
		StringTokenizer st = new StringTokenizer(input2, " ");
		
		int max = -1; // 최대 맛 점수
 		int maxIdx = -1; // 최대 맛 인덱스
		int[] arr = new int[N];
		
		for(int i=0; i<N; i++){
			arr[i] = Integer.parseInt(st.nextToken());
			
			if(max < arr[i]){
				max = arr[i];
				maxIdx = i;
			}
		}
		
		
		// 조건 확인
		boolean flag = false;
		// 최대점수 앞부분
		for(int i=maxIdx; i>0; i--){
			if(arr[i] < arr[i-1]){
				flag = true;
				break;
			}
		}
		
		// 최대점수 아랫부분
		if(!flag){
			for(int i=maxIdx; i<N-1; i++){
				if(arr[i] < arr[i+1]){
					flag = true;
					break;
				}
			}	
		}
		
		// 점수 계산
		int result = 0; // 맛 점수 
		
		if(flag){
			System.out.println("0");
		} else {
			for(int i=0; i<N; i++){
				result += arr[i];
			}
			System.out.println(result);
		}
		
	}
}