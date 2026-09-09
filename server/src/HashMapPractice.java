import java.util.HashMap;
import java.util.Map;

public class HashMapPractice {

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        // 要素の追加
        map.put("Java", "プログラミング言語");
        map.put("Spring", "フレームワーク");
        map.put("JUnit", "テストツール");
        System.out.println(map);

        // ループ処理
        for (Map.Entry<String, String> entry : map.entrySet()) { //拡張for文、型を宣言しキーと値のセットの一覧を作成している
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + ": " + value);
        }
    }
}
