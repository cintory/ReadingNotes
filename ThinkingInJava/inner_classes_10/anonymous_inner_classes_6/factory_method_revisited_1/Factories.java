package inner_classes_10.anonymous_inner_classes_6.factory_method_revisited_1;

public class Factories {
    public static void serviceConsumer(ServiceFactory fact) {
        Service s = fact.getService();
        s.method1();
        s.method2();
    }

    public static void main(String[] ars) {
        serviceConsumer(Implementation1.factory);
        //  Implementations are completely interchangeable.
        serviceConsumer(Implementation2.factory);
    }
}
