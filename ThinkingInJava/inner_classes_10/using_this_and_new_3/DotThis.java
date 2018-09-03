package inner_classes_10.using_this_and_new_3;

//Qualifying access to the outer-class object.

public class DotThis {
    void f() {
        System.out.println("Dothis.f()");
    }

    public class Inner {
        public DotThis outer() {
            return DotThis.this;
            //A plain "this" would be Inner's "this"
        }
    }

    public Inner inner() {
        return new Inner();
    }

    public static void main(String[] args) {
        DotThis dt = new DotThis();
        DotThis.Inner dti = dt.inner();
        dti.outer().f();
    }
}
