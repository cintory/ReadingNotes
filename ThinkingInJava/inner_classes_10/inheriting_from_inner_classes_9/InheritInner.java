package inner_classes_10.inheriting_from_inner_classes_9;
//  Inheriting an inner classes

class WithInner {
    class Inner {
    }
}

public class InheritInner extends WithInner.Inner {
    //! InheritiNNER()  {}  // Won't compile
    InheritInner(WithInner wi) {
        wi.super();
    }

    public static void main(String[] args) {
        WithInner wi = new WithInner();
        InheritInner ii = new InheritInner(wi);
    }
}
