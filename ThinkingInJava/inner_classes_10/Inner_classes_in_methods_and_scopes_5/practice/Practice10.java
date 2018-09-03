package inner_classes_10.Inner_classes_in_methods_and_scopes_5.practice;

public class Practice10 {
    private interface IPractice {
        void func();
    }

    IPractice createInterface(boolean b) {
        if (b) {
            class ImplPractice implements IPractice {

                @Override
                public void func() {
                    System.out.println("Implement interface");
                }
            }
            ImplPractice p = new ImplPractice();
            return p;
        } else return null;
    }

    public static void main(String[] args) {
        Practice10 p = new Practice10();
        p.createInterface(true).func();
    }
}
