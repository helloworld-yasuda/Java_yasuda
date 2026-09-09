//5.カスタム例外の作成
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class ExceptionPractice {
    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("年齢は18歳以上でなければなりません");
        }
        System.out.println("成年です");
    }
    public static void main(String[] args) {
        try {
            checkAge(16);
        } catch (InvalidAgeException e) {
            System.out.println("エラー: " + e.getMessage());
        }
    }
}