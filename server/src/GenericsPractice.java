public class GenericsPractice {

    static class Box<T> {
        private T content;

        public void set(T content) {
            this.content = content;
        }

        public T get() {
            return content;
        }
    }

    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>();
        intBox.set(100);
        System.out.println(intBox.get());

        Box<String> stringBox = new Box<>();
        stringBox.set("Hello");
        System.out.println(stringBox.get());
    }
}
