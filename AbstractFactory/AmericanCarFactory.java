public class AmericanCarFactory implements ICarFactory {
    @Override
    public IEngine createEngine() {
        return new AmericanEngine();
    }

    @Override
    public IWheel createWheel() {
        return new AmericanWheel();
    }
}