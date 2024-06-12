import java.io.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String[] arr = input.split(" ");
		
		int W = Integer.parseInt(arr[0]);
		double R = (double)Integer.parseInt(arr[1]);
		
		double rm = W * ( 1 + R / 30);
		
		System.out.println((int)rm);
		
	}
}