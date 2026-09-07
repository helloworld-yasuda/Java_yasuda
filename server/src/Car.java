public class Car {
    // クラスを作成してみよう。フィールドにbrand(String型)とspeed(int型)を定義
    public String brand;
    public int speed;

    // コンストラクタを作成してみよう。コンストラクタを作成し、brandとspeedを初期化する
    public Car(String brand, int speed){
        this.brand = brand;
        this.speed = speed;
    }

    // メソッドを作成してみよう。driveメソッドを作成し、「車が走り出しました」と出力する
    public void drive(){
        System.out.println("車が走り出しました");
    }
}