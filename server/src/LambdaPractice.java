import java.util.function.BiFunction;

//13.ラムダ式
public class LambdaPractice {
	public static void main(String[] args) {
        // 2つの整数を掛け算するラムダ式
        BiFunction<Integer, Integer, Integer> multiply = (a, b) -> a * b;
        System.out.println(multiply.apply(25,20));
	}
}

