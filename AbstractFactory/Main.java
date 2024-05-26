public class Main {
    public static void main(String[] args) {
        CarFactory europeanFactory = new EuropeanCarFactory();
        CarFactory americanFactory = new AmericanCarFactory();

        createAndTestCarParts(europeanFactory);
        createAndTestCarParts(americanFactory);
    }

    private static void createAndTestCarParts(CarFactory factory) {
        Engine engine = factory.createEngine();
        Wheel wheel = factory.createWheel();

        testProducts(engine, wheel);
    }

    private static void testProducts(Engine engine, Wheel wheel) {
        engine.design();
        wheel.manufacture();
    }
}
