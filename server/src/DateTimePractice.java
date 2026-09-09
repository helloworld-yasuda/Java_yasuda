import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimePractice {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();//実行した瞬間お現在日時を取得
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");//フォーマットの型を作成
        String formatted = now.format(formatter);//取得した日時をフォーマットに入れ込み、型は作成したもの
        System.out.println(formatted);
    }
}
