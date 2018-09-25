package inner_classes_10.nested_classes_7.reaching_outward_from_multiplynested_class_2;
//Nested classes can access all members of all levels of the classes they are nested within.


class MNA {
    private void f() {

    }

    class A {
        private void g() {
        }

        public class B {
            void h() {
                g();
                f();
            }
        }
    }
}

public class MultiNestingAccess {
    public static void main(String[] args) {
        MNA mna = new MNA();
        MNA.A mnaa = mna.new A();
        MNA.A.B mnaab = mnaa.new B();
        mnaab.h();
    }
}
