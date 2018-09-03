package inner_classes_10.using_this_and_new_3.practice;

import inner_classes_10.the_link_to_outer_class_2.Selector;

public class Practice4 {

    static public class Sequence {
        private Object[] items;
        private int next = 0;

        public Sequence(int size) {
            items = new Object[size];
        }

        public void add(Object x) {
            if (next < items.length) {
                items[next++] = x;
            }
        }

        private class SequenceSelector implements Selector {
            private int i = 0;

            @Override
            public boolean end() {
                return i == items.length;
            }

            @Override
            public Object current() {
                return items[i];
            }

            @Override
            public void next() {
                if (i < items.length) i++;
            }

            public Sequence getSequence() {
                return Sequence.this;
            }
        }

        public Selector selector() {
            return new SequenceSelector();
        }


    }

    public static void main(String[] args) {
        Sequence sequence = new Sequence(10);
        for (int i = 0; i < 10; i++)
            sequence.add(Integer.toString(i));
        Selector selector = sequence.selector();
        while (!selector.end()) {
            System.out.println(selector.current() + " ");
            selector.next();
        }
    }
}
