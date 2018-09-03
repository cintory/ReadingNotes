package inner_classes_10.the_link_to_outer_class_2.practice;

import inner_classes_10.the_link_to_outer_class_2.Selector;
import inner_classes_10.the_link_to_outer_class_2.Sequence;

public class Practice2 {
    static class StringHolder {
        private String s;

        public StringHolder(String s) {
            this.s = "I'm No:" + s + " String holder.";
        }

        public String toString() {
            return s;
        }
    }

    public StringHolder stringHolder(String s) {
        return new StringHolder(s);
    }

    public static void main(String[] args) {
        Practice2 p = new Practice2();
        Sequence sequence = new Sequence(10);
        Selector selector = sequence.selector();
        for (int i = 0; i < 10; i++)
            sequence.add(new StringHolder(Integer.toString(i)));
        while (!selector.end()) {
            System.out.println(selector.current().toString());
            selector.next();
        }
    }

}
