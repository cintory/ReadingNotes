package inner_classes_10.why_inner_class_8.control_frameworks_2;

//Configure and execute the greenhouse system.


public class GreenhouseController {
    public static void main(String[] args) {
        GreenhouseControls gc = new inner_classes_10.why_inner_class_8.control_frameworks_2.GreenhouseControls();
        //  Instead of hard-Wiring, you could parse configuration information from a text file here:
        gc.addEvent(gc.new Bell(900));
        Event[] eventList = {
                gc.new ThermostatNight(0),
                gc.new lightOn(200),
                gc.new LightOff(400),
                gc.new WaterOn(600),
                gc.new WaterOff(800),
                gc.new ThermostatDay(1400)
        };
        gc.addEvent(gc.new Restart(2000, eventList));
        if (args.length == 1) {
            gc.addEvent(new GreenhouseControls.Terminate(new Integer(args[0])));
        }
        gc.run();
    }
}
