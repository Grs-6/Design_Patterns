public class UnderGraduateStudent implements IStudent {
    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}