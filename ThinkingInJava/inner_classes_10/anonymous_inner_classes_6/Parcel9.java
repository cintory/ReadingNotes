package inner_classes_10.anonymous_inner_classes_6;

// An anonymous inner class that performs initialization.
// A briefer version of Parcel5.java


public class Parcel9 {
    //  Argument must be final inside.
    //  anonymous inner class:

    public interface Destination {
        String readLabel();
    }

    public Destination destination(final String dest) {
        return new Destination() {
            private String label = dest;

            public String readLabel() {
                return label;
            }

        };
    }

    public static void main(String[] args) {
        Parcel9 p = new Parcel9();
        Destination d = p.destination("Tasmania");
    }
}
