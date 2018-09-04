package inner_classes_10.Inner_classes_in_methods_and_scopes_5.practice;

public class OuterPractice11 {
    public interface IPractice11 {
        void say(String s);
    }

    private class PrivateInner implements IPractice11 {

        @Override
        public void say(String s) {
            System.out.println(s + " inner class");
        }
    }

    IPractice11 getInnerInstance() {
        return new PrivateInner();
    }
}


