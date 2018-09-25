package inner_classes_10.nested_classes_7.classes_inside_interfaces_1;

//Putting test code in a nested class.
//{main: TestBed$Tester}
public class TestBed {
    public void f() {
        System.out.println("f()");
    }

    public static class Tester {
        public static void main(String[] args) {
            TestBed t = new TestBed();
            t.f();
        }
    }
}
