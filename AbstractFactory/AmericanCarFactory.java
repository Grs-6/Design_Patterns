public class AmericanCarFactory implements CarFactory {
    @Override
    public Engine createEngine() {
        return new AmericanEngine();
    }

    @Override
    public Wheel createWheel() {
        return new AmericanWheel();
    }
}