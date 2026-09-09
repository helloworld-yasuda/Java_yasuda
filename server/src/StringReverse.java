public class StringReverse {
    public String reverse(String input) {
        StringBuilder stringBuilder = new StringBuilder(input);//StringBuilderクラスをインスタンス化(引数にinputを渡す)
        String reverse = stringBuilder.reverse().toString();//reverseメソッドでinputを逆順に
        return reverse;//reverseメソッドの結果を返す
    }
}