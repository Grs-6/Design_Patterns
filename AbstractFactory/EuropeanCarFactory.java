public class EuropeanCarFactory implements ICarFactory {
    @Override
    public IEngine createEngine() {
        return new EuropeanEngine();
    }

    @Override
    public IWheel createWheel() {
        return new EuropeanWheel();
    }
}