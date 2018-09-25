package inner_classes_10.nested_classes_7.classes_inside_interfaces_1.parctice;


interface In {
    String f();

    String g();

    class NestedClass {
        static void test(In i) {
            System.out.println(i.f() + i.g());
        }
    }

}


public class Parctice21 {

    public static void main(String[] args) {
        In in = new In() {
            @Override
            public String f() {
                return "This is f();\n";
            }

            @Override
            public String g() {
                return "This is g();\n";
            }
        };
        In.NestedClass.test(in);
    }
}
