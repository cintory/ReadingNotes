package inner_classes_10.why_inner_class_8.control_frameworks_2.practice.practice24;

import inner_classes_10.why_inner_class_8.control_frameworks_2.Controller;
import inner_classes_10.why_inner_class_8.control_frameworks_2.Event;

public class GreenhouseControls24 extends Controller {
    private boolean light = false;

    public class lightOn extends Event {

        public lightOn(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            //Put hardware control code here to physically turn on the light
            light = true;
        }

        public String toString() {
            return "Light is on";
        }
    }

    public class LightOff extends Event {
        public LightOff(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            //Put hardware control code here to physically turn off the light.
            light = false;
        }

        public String toString() {
            return "Light is off";
        }
    }

    private boolean water = false;

    public class WaterOn extends Event {
        public WaterOn(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            //Put hardware water control code here.
            water = true;
        }

        public String toString() {
            return "Greenhouse water is on ";
        }
    }

    public class WaterOff extends Event {
        public WaterOff(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            //Put hardware control code here.
            water = false;
        }

        public String toString() {
            return "Greenhouse water is off";
        }
    }

    private String thermostat = "Day";

    public class ThermostatNight extends Event {
        public ThermostatNight(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            //Put hardware control code here.
            thermostat = "Night";
        }

        public String toString() {
            return "Thermostat on night setting.";
        }
    }

    public class ThermostatDay extends Event {
        public ThermostatDay(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            //Put hardware control code here.
            thermostat = "Day";
        }

        public String toString() {
            return "Thermostat on day setting.";
        }
    }

    //An example of an action() that inserts a new one of itself into the event list:
    public class Bell extends Event {

        public Bell(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            addEvent(new GreenhouseControls24.Bell(delayTime));
        }

        public String toString() {
            return "Bing";
        }
    }

    private boolean fan = false;

    public class FanOn extends Event {

        public FanOn(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            fan = true;
        }

        public String toString() {
            return "Fan is on.";
        }
    }

    public class FanOff extends Event {

        public FanOff(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            fan = false;
        }

        public String toString() {
            return "Fan is off.";
        }
    }

    public class Restart extends Event {
        private Event[] eventList;

        public Restart(long delayTime, Event[] eventList) {
            super(delayTime);
            this.eventList = eventList;
            for (Event e : eventList) {
                addEvent(e);
            }
        }

        @Override
        public void action() {
            for (Event e : eventList) {
                e.start();  //Return each event
                addEvent(e);
            }
            start();
            addEvent(this);
        }

        public String toString() {
            return "Restarting system";
        }
    }

    public static class Terminate extends Event {

        public Terminate(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            System.exit(0);

        }

        public String toString() {
            return "Terminating";
        }
    }
}

