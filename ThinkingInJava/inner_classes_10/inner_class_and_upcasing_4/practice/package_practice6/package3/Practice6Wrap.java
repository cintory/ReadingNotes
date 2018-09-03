package inner_classes_10.inner_class_and_upcasing_4.practice.package_practice6.package3;

import inner_classes_10.inner_class_and_upcasing_4.practice.package_practice6.package1.IPractice6;
import inner_classes_10.inner_class_and_upcasing_4.practice.package_practice6.package2.ObjPractice6;

public class Practice6Wrap extends ObjPractice6 {

    public IPractice6 upCasting() {
        return (IPractice6) implPractice6;
    }

}
