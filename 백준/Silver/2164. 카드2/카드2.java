
import java.io.IOException;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> q = new LinkedList<>();

        int N = sc.nextInt();

        for (int i = 1; i < N + 1; i++) {
            q.add(i);
        }

        while (q.size() != 1) {
            q.poll(); // 마지막 버리기

            q.add(q.poll()); // 처음꺼 꺼내서 마지막에 넣기

        }

        System.out.println(q.poll());
    }
}
