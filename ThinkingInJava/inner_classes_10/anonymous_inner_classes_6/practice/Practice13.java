package inner_classes_10.anonymous_inner_classes_6.practice;

public class Practice13 {
    private interface IPractice {
        void func();
    }

    public IPractice iPractice() {
        return new IPractice() {
            @Override
            public void func() {
                System.out.println("Implement interface");
            }
        };
    }


    public static void main(String[] args) {
        Practice13 p = new Practice13();
        p.iPractice().func();
    }
}
