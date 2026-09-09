import java.util.Stack;

public class StackPractice {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // 要素の追加（積み上げる＝push）
        stack.push(1);
        stack.push(2);
        stack.push(3); // 3が一番上にある状態
        stack.push(4);
        stack.push(5);

        // スタックが空になるまで取り出す（pop）
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
