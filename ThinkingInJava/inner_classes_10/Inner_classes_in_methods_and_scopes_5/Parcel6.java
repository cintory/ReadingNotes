package inner_classes_10.Inner_classes_in_methods_and_scopes_5;

//Nesting a class within a scope.
public class Parcel6 {
    private void internalTraking(boolean b) {
        if (b) {
            class TrakingSlip {
                private String id;

                TrakingSlip(String s) {
                    id = s;
                }

                String getSlip() {
                    return id;
                }
            }
            TrakingSlip ts = new TrakingSlip("slip");
            String s = ts.getSlip();
        }
        // Can't use it here! Out of scope:
        // ！ TrackingSlip ts = new TrackingSlip("x");
    }

    public void track() {
        internalTraking(true);
    }

    public static void main(String[] args) {
        Parcel6 p = new Parcel6();
        p.track();
    }
}
