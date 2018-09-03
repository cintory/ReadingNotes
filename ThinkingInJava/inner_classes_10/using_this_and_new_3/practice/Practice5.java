package inner_classes_10.using_this_and_new_3.practice;

public class Practice5 {
    static class Outer {
        class Inner {
        }
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
    }
}
