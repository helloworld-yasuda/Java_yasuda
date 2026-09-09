import java.io.File;

public class FileCheckPractice {
	public static void main(String[] args) {
        // 確認したいファイルのパスを指定
        String filePath = "test.txt";
        File file = new File(filePath);//ファイルオブジェクトを作成

        // ファイルが存在するかチェック
        if (file.exists()) {
            System.out.println("ファイルは存在します。");
        } else {
            System.out.println("ファイルは存在しません。");
        }
    }
}