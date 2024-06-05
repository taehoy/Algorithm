import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        Queue<Process> queue = new LinkedList<>();
        
        // 큐를 (인덱스, 우선순위) 형태로 변환합니다.
        for (int i = 0; i < priorities.length; i++) {
            queue.offer(new Process(i, priorities[i]));
        }
        
        int printOrder = 0;  // 몇 번째로 출력되는지 카운트
        
        while (!queue.isEmpty()) {
            Process current = queue.poll();
            
            // 현재 프로세스보다 우선순위가 높은 프로세스가 있는지 확인합니다.
            boolean hasHigherPriority = false;
            for (Process p : queue) {
                if (p.priority > current.priority) {
                    hasHigherPriority = true;
                    break;
                }
            }
            
            if (hasHigherPriority) {
                queue.offer(current);  // 다시 큐에 넣습니다.
            } else {
                printOrder++;  // 프로세스를 실행(출력)합니다.
                if (current.index == location) {
                    return printOrder;
                }
            }
        }
        
        return -1;  // 오류가 발생할 경우 -1을 반환합니다.
    }
    
    static class Process {
        int index;
        int priority;
        
        Process(int index, int priority) {
            this.index = index;
            this.priority = priority;
        }
    }
}