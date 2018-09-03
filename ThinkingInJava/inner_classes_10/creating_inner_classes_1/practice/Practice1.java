package inner_classes_10.creating_inner_classes_1.practice;

public class Practice1 {
    class Outer {


        class Inner {
            public void saySomething() {
                System.out.println("Hello, i'm inner class");
            }
        }

        public Inner inner() {
            return new Inner();
        }
    }

    private Outer createOuter() {
        return new Outer();
    }

    public static void main(String[] args) {
        Practice1 p = new Practice1();
        Outer outer = p.createOuter();
        Outer.Inner inner = outer.inner();
        inner.saySomething();
    }
}
