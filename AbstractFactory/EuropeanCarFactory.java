public class EuropeanCarFactory implements CarFactory {
    @Override
    public Engine createEngine() {
        return new EuropeanEngine();
    }

    @Override
    public Wheel createWheel() {
        return new EuropeanWheel();
    }
}