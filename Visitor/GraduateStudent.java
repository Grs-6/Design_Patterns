public class GraduateStudent implements Student {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}