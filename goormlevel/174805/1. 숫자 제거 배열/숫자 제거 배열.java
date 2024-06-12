import java.io.*;
import java.util.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String[] arr = input.split(" ");
		int N = Integer.parseInt(arr[0]);
		String K = arr[1]; // 포함되지 않아야 하는 문자열
		
		String input2 = br.readLine();
		String[] arr2 = input2.split(" ");
		
		int size = arr2.length;
		
		List<Integer> list = new ArrayList<>();
		
		// 포함되는 수 제거
		for(int i=0; i<size; i++){
			if(!arr2[i].contains(K)){
				list.add(Integer.parseInt(arr2[i]));
			}
		}
		
		System.out.println(list.size());
		
	}
}