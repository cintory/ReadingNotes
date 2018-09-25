package inner_classes_10.inheriting_from_inner_classes_9.practice;


class FirstOuter {
    public class Inner {
        Inner(String s) {
            System.out.println("FirstInner constructor with String");
        }
    }
}

public class Practice26 {

    public class SecondInner extends FirstOuter.Inner {
        SecondInner(FirstOuter f) {
            f.super("String");
        }
    }

    public static void main(String[] args) {
        FirstOuter fo = new FirstOuter();
        Practice26 p = new Practice26();
        SecondInner si = p.new SecondInner(fo);
    }
}


