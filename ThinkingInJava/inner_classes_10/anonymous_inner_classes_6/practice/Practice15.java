package inner_classes_10.anonymous_inner_classes_6.practice;

public class Practice15 {
    private class NoDefaultConstructor {
        String parameter = "none";

        public NoDefaultConstructor(String parameter) {
            this.parameter = parameter;
            System.out.println("Parameter: " + parameter);
        }
    }

    private class ReturnInstance {
        public NoDefaultConstructor getInstance(String parametere) {
            return new NoDefaultConstructor(parametere);
        }
    }

    public ReturnInstance returnInstance() {
        return new ReturnInstance();
    }

    public static void main(String[] args) {
        Practice15 p = new Practice15();
        ReturnInstance instance = p.returnInstance();
        NoDefaultConstructor constructor = instance.getInstance("parameter");
    }
}
