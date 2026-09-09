import java.util.Arrays;
import java.util.List;

public class StreamPractice {
	public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 5, 7, 2, 8);
        List<Integer> doubled = numbers.stream()
        .map(n -> n * 2)  // 各要素を 2 倍に変換
        .toList();

        System.out.println(doubled);
	}
}
