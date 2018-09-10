package inner_classes_10.nested_classes_7.practice;

public class Practice18 {
    private static class NestedClass {
        public void SaySomething() {
            System.out.println("Hello world.");
        }
    }

    public static void main(String[] args) {
        NestedClass n = new NestedClass();
        n.SaySomething();
    }
}
