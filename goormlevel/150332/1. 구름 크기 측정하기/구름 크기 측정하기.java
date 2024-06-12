import java.io.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String[] arr = input.split(" ");
		
		int n1 = Integer.parseInt(arr[0]);
		int n2 = Integer.parseInt(arr[1]);
		
		System.out.println(n1 * n2);
	}
}