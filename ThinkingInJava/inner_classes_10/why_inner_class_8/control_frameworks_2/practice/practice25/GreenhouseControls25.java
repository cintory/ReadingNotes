package inner_classes_10.why_inner_class_8.control_frameworks_2.practice.practice25;

import inner_classes_10.why_inner_class_8.control_frameworks_2.Event;

public class GreenhouseControls25 extends inner_classes_10.why_inner_class_8.control_frameworks_2.GreenhouseControls {
    private boolean waterMist = false;

    public class WaterMistOn extends Event {

        public WaterMistOn(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            waterMist = true;
        }

        public String toString() {
            return "Water mist generator on.";
        }
    }

    public class WaterMistOff extends Event {

        public WaterMistOff(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            waterMist = false;
        }

        public String toString() {
            return "Water mist generator off.";
        }
    }
}
