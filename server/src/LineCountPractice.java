import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LineCountPractice {
	public static void main(String[] args) {
        String filePath = "example.txt"; // 読み込むファイル名
        int lineCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            while (br.readLine() != null) { // 1行ずつ読み込む
                lineCount++;
            }
            System.out.println("ファイルの行数: " + lineCount);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
