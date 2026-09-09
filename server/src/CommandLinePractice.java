public class CommandLinePractice {
    //4.コマンドライン引数
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println("こんにちは、" + args[i] + "さん！");
        }
    }
}