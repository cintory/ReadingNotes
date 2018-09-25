package inner_classes_10.why_inner_class_8.control_frameworks_2.practice.practice25;

import inner_classes_10.why_inner_class_8.control_frameworks_2.Event;

public class GreenhouseController25 {
    public static void main(String[] args) {
        GreenhouseControls25 gc = new GreenhouseControls25();
        //  Instead of hard-Wiring, you could parse configuration information from a text file here:
        gc.addEvent(gc.new Bell(900));
        Event[] eventList = {
                gc.new ThermostatNight(0),
                gc.new lightOn(200),
                gc.new LightOff(400),
                gc.new WaterOn(600),
                gc.new WaterOff(800),
                gc.new WaterMistOn(900),
                gc.new WaterMistOff(1000),
                gc.new ThermostatDay(1400)
        };
        gc.addEvent(gc.new Restart(2000, eventList));
        if (args.length == 1) {
            gc.addEvent(new GreenhouseControls25.Terminate(new Integer(args[0])));
        }
        gc.run();
    }
}
