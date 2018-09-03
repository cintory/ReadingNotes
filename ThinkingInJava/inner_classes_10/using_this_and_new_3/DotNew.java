package inner_classes_10.using_this_and_new_3;


//Creating an inner class directly using the .new syntax
public class DotNew {
    public class Inner {
    }

    public static void main(String[] args) {
        DotNew dn = new DotNew();
        DotNew.Inner dni = dn.new Inner();
    }

}
