import java.util.LinkedList;
import java.util.Queue;

public class QueuePractice {
    public static void main(String[] args) {
        // Queue の作成
        Queue<String> queue = new LinkedList<>();

        // 要素の追加
        queue.offer("A");
        queue.offer("B");
        queue.offer("C");
        queue.offer("D");
        queue.offer("E");
        
        while (!queue.isEmpty()) {
        System.out.println(queue.poll());
        }
    }
}
