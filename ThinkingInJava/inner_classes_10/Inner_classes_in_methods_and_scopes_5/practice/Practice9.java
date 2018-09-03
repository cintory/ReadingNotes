package inner_classes_10.Inner_classes_in_methods_and_scopes_5.practice;

public class Practice9 {
    private interface IPractice {
        void func();
    }

    IPractice createInterface() {
        class ImplPractice implements IPractice {

            @Override
            public void func() {
                System.out.println("Implement interface");
            }
        }
        ImplPractice p = new ImplPractice();
        return p;
    }

    public static void main(String[] args) {
        Practice9 p = new Practice9();
        p.createInterface().func();
    }
}
