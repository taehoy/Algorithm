import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[sc.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}

		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			
			while (a < b) {
				int temp = arr[a];
				arr[a++] = arr[b];
				arr[b--] = temp;
			}

		}
		String c = "";
		for (int j = 0; j < arr.length; j++) {
			c += arr[j] + " ";
		}
		System.out.print(c.trim());
		sc.close();
	}
}