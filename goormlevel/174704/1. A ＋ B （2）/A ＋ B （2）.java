import java.io.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		String[] arr = input.split(" ");
		double d1 = Double.valueOf(arr[0]);
		double d2 = Double.valueOf(arr[1]);
		
		System.out.printf("%.6f", d1 + d2);
		
	}
}