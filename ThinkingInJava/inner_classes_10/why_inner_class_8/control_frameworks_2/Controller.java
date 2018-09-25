package inner_classes_10.why_inner_class_8.control_frameworks_2;
//The reusable framework for control systems.


import java.util.ArrayList;
import java.util.List;

public class Controller {
    // A class from java.util to hold Event objects:
    private List<Event> eventList = new ArrayList<>();

    public void addEvent(Event e) {
        eventList.add(e);
    }

    public void run() {
        while (eventList.size() > 0) {
            //Make a copy so you're not modifying the list while you're selecting the elements in it:
            for (Event e : new ArrayList<>(eventList)) {
                if (e.ready()) {
                    System.out.println(e);
                    e.action();
                    eventList.remove(e);
                }
            }
        }
    }
}
