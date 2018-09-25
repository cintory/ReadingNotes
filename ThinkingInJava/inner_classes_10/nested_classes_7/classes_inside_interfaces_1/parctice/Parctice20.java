package inner_classes_10.nested_classes_7.classes_inside_interfaces_1.parctice;

interface NestedInterface {
    class NestedClass {
        public void f() {
            System.out.println("f();");
        }
    }
}

public class Parctice20 {
    public static void main(String[] args) {
        NestedInterface.NestedClass nestedClass = new NestedInterface.NestedClass();
        nestedClass.f();
    }
}