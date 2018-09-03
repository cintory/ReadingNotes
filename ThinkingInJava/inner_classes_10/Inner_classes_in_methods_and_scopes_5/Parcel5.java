package inner_classes_10.Inner_classes_in_methods_and_scopes_5;

import inner_classes_10.inner_class_and_upcasing_4.Destination;

//Nesting a class within a method.
public class Parcel5 {
    public Destination destination(String s) {
        class PDestination implements Destination {
            private String label;

            private PDestination(String whereTo) {
                label = whereTo;
            }

            @Override
            public String readLabel() {
                return label;
            }
        }
        return new PDestination(s);
    }

    public  static  void main(String[] args){
        Parcel5 p = new Parcel5();
        Destination d  =p.destination("Tasmania");
    }
}
