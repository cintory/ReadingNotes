package inner_classes_10.inner_class_and_upcasing_4.practice;

public class Practice7 {
    private int i = 1;

    private void privateFunc() {
        System.out.println("This is a private function.");
    }

    class Inner {
        void modifyOuterClass() {
            i++;
            privateFunc();
        }
    }

    public void log() {
        System.out.println(Integer.toString(i));
    }

    public void test() {
        Inner inner = new Inner();
        inner.modifyOuterClass();
    }

    public static void main(String[] args) {
        Practice7 p = new Practice7();
        p.log();
        p.test();
        p.log();
    }

}
