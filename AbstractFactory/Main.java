public class Main {
    public static void main(String[] args) {
        ICarFactory europeanFactory = new EuropeanCarFactory();
        ICarFactory americanFactory = new AmericanCarFactory();

        createAndTestCarParts(europeanFactory);
        createAndTestCarParts(americanFactory);
    }

    private static void createAndTestCarParts(ICarFactory factory) {
        IEngine engine = factory.createEngine();
        IWheel wheel = factory.createWheel();

        testProducts(engine, wheel);
    }

    private static void testProducts(IEngine engine, IWheel wheel) {
        engine.design();
        wheel.manufacture();
    }
}
