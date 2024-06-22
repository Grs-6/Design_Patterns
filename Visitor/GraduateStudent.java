public class GraduateStudent implements IStudent {
    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}