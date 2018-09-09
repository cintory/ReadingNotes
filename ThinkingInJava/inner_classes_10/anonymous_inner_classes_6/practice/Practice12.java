package inner_classes_10.anonymous_inner_classes_6.practice;

public class Practice12 {


    private int i = 1;


    public Inner inner() {
        return new Inner() {
            @Override
            public void modifyOuter() {
                i++;
                System.out.println("The outer i is " + i);
            }
        };
    }

    public static void main(String[] args) {
        Practice12 p = new Practice12();
        p.inner().modifyOuter();
    }

    private interface Inner {
        void modifyOuter();
    }
}
