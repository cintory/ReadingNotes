package inner_classes_10.the_link_to_outer_class_2.practice;

public class Practice3 {

    class Outer {

        private String s = "I'm out string";


        class Inner {
            public String logOuterString() {
                return s;
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
        Practice3 p = new Practice3();
        Outer outer = p.createOuter();
        Outer.Inner inner = outer.inner();
        System.out.println(inner.logOuterString());
    }
}

