import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

//6.ファイルの読み書き
public class FilePractice {
    public static void main(String[] args) {
        String fileName = "example.txt";
        try {
            FileWriter fileWriter = new FileWriter(fileName);
            fileWriter.write("Hello, Java!\nThis is a file example.\n");
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("ファイル作成に失敗しました");
            e.printStackTrace();
        }

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("ファイル読み込みに失敗しました");
            e.printStackTrace();
        }
    }
}
