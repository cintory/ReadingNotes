package inner_classes_10.Inner_classes_in_methods_and_scopes_5.practice;

public class Practice11 {


    public static void main(String[] args) {
        Practice11 p = new Practice11();
        OuterPractice11 outer = new OuterPractice11();
        outer.getInnerInstance().say("Outers");
//        Error: cannot find symbol: class Inner:
//        ((OuterPractice11.PrivateInner) outer.getInnerInstance()).say("outer");
    }
}
