package inner_classes_10.inner_class_and_upcasing_4.practice.package_practice6.package2;

import inner_classes_10.inner_class_and_upcasing_4.practice.package_practice6.package1.IPractice6;

public class ObjPractice6 {

    protected ImplPractice6 implPractice6;

    protected class ImplPractice6 implements IPractice6 {

        @Override
        public void function1() {
            System.out.println("This is a protected class.");
        }
    }
}
