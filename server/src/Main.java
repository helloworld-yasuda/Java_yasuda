import person.Person;

public class Main {
  public static void main(String[] args) {
    // 文字列を格納する変数を宣言 ・String型を使って、"hoge"を格納する変数を宣言してください。
    String hoge = "hoge";
    System.out.println("hoge");

    // 数値を格納する変数を宣言してください ・int型を使って、69を格納する変数を宣言してください。
    int num = 69;
    System.out.println(num);

    // 真偽値を格納する変数を宣言してください ・boolean型を使って、falseを格納する変数を宣言してください。
    boolean isfalse = false;
    System.out.println(isfalse);

    // 未定義の状態で変数を宣言してください ・double型を使って、値は後から代入してください。
    double num2;
    num2 = 0;
    System.out.println(num2);

    // nullを格納する変数を宣言してください ・String型を使って、nullを格納する変数を宣言してください。
    String nullString = null;
    System.out.println(nullString);

    // 配列を作成してみよう ・String[]型を使って、以下の名前が含まれる配列を作成してください： "田中", "佐藤", "久保田", "鈴木", "河本"
    String [] names = {"田中", "佐藤", "久保田", "鈴木", "河本"};
      System.out.println(names[0]);

    // オブジェクトを宣言してみよう 
    Person person1 = new Person(); 
    person1.id = 1;
    person1.name = "太田";
    person1.age = 20;
    System.out.println(person1.id);
    System.out.println(person1.name);
    System.out.println(person1.age);

    // 配列の要素を表示してみよう。配列{10, 20, 30, 40, 50}の要素を、for文を使って順に出力してください。
    int [] numbers1 ={10, 20, 30, 40, 50};
    for(int i = 0; i < numbers1.length; i++){
      System.out.println(numbers1[i]);
    }

    // 配列の合計を計算してみよう。配列{1, 2, 3, 4, 5}の全ての要素を足して、その合計を出力してください。
    int [] numbers2 = {1, 2, 3, 4, 5};
    int sum = 0;
    for(int i = 0; i < numbers2.length; i++){
      sum += numbers2[i];
    }
    System.out.println(sum);

    // 配列の最大値を求めてみよう。配列{3, 5, 7, 2, 8}から、最大値を求めて出力してください。
    int [] numbers3 ={3, 5, 7, 2, 8};
    int max = numbers3[0];
    for(int i = 0; i < numbers3.length; i++){
      if(numbers3[i] > max){
        max = numbers3[i];
      }
    }
    System.out.println(max);

    // 二次元配列を操作してみよう。以下の二次元配列を作成し、各行の要素を順番に出力してください：{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}
    int [][] numbers4 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    for(int i = 0; i < numbers4.length; i++){
      for(int j = 0; j < numbers4[i].length; j++){
        System.out.println(numbers4[i][j]);
      }
    }

    Car car = new Car("Toyota", 100);
    car.drive();

    for(int i = 0; i <= 20 ; i++){
      if(i % 2 == 0){
        System.out.println(i);
      }
    }

    // FizzBuzzプログラムを作りましょう。1から30までの数字について、以下の条件に従って出力してください：3の倍数の場合は「Fizz」5の倍数の場合は「Buzz」3と5の倍数の場合は「FizzBuzz」
    for(int i = 1; i <= 30 ; i++){
      if(i % 3 == 0 && i % 5 == 0){
        System.out.println("FizzBuzz");
      }
      else if(i % 3 == 0){
        System.out.println("Fizz");
      }
      else if(i % 5 == 0){
        System.out.println("Buzz");
      }
      else{
        System.out.println(i);
      }
    }

    // 数値を逆順に並べて表示してみよう。配列{5, 10, 15, 20}の要素を逆順に出力してください。
    int [] numbers5 = {5, 10, 15, 20};
    for(int i = numbers5.length - 1; i >= 0; i--){
      System.out.println(numbers5[i]);
    }

    // 例外をキャッチするプログラムを作りましょう
    int [] numbers6 = {1, 2, 3};
    try{
      for(int i = 0; i <= numbers6.length; i++){
      System.out.println(numbers6[i]);
      }
    }catch(ArrayIndexOutOfBoundsException e){
      System.out.println("範囲外のアクセスです");
    }
  }

  // 関数を宣言してみよう,引数付きの関数を作成してみよう
  public static void greet(String name){
    System.out.println("こんにちは、" + name + "さん");
  }

  // 数値を受け取り、計算をする関数を作りましょう。 2つの整数を引数として受け取り、その和を返す関数を作成してください。
  public static int add(int a, int b){
    return a + b;
  }

  // 文字列を結合する関数を作りましょう。2つの文字列を引数として受け取り、それらを結合して返す関数を作成してください。
  public static String connect (String name, String hobby){
    return name + "は" + hobby + "が好きです";
  }

  // 戻り値のない関数を作りましょう。引数に年齢（int型）を受け取り、「未成年」または「成人」と出力する関数を作成してください。
  public static void print(int age){
    if(age < 18){
      System.out.println("未成年");
    }
    if(age >= 18){
      System.out.println("成人");
    }
  }
}
