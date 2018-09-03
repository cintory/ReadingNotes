package inner_classes_10.inner_class_and_upcasing_4;

public class Parcel4 {
    private class PCcontents implements Contents {
        private int i = 11;

        @Override
        public int value() {
            return i;
        }
    }

    protected class PDestination implements Destination {
        private String label;

        private PDestination(String w) {
            label = w;
        }

        @Override
        public String readLabel() {
            return label;
        }
    }

    public Destination destination(String s) {
        return new PDestination(s);
    }

    public Contents contents() {
        return new PCcontents();
    }
}
