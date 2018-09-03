package inner_classes_10.inner_class_and_upcasing_4;

public class TestParcel {
    public static void main(String[] args) {
        Parcel4 p  = new Parcel4();
        Contents c = p.contents();
        Destination d= p.destination("Tasmania");
        // Illegal -- can't access private class:
        //! Parcel4.PContents pc = p.new PContents():
    }
}
