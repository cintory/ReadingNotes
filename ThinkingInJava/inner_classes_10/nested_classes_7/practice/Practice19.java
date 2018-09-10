package inner_classes_10.nested_classes_7.practice;

public class Practice19 {

    public Practice19() {
        System.out.println("Practice19");
    }

    public class InnerClass {
        public InnerClass() {
            System.out.println("InnerClass");
        }

        public class InnerInnerClass {
            public InnerInnerClass() {
                System.out.println("InnerInnerClass");
            }
        }
    }

    public static class NestedClass {
        public NestedClass() {
            System.out.println("NestedClass");
        }

        public static class NestedInnerClass {
            public NestedInnerClass() {
                System.out.println("NestedInnerClass");
            }
        }
    }

    public static void main(String[] args) {
        Practice19 p = new Practice19();
        InnerClass innerClass = p.new InnerClass();
        InnerClass.InnerInnerClass innerInnerClass = innerClass.new InnerInnerClass();
        NestedClass nestedClass = new NestedClass();
        NestedClass.NestedInnerClass nestedInnerClass = new NestedClass.NestedInnerClass();
    }
}
