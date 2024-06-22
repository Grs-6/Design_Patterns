public class TuitionCalculationVisitor implements IVisitor {
    @Override
    public void visit(UnderGraduateStudent student) {
        System.out.println("Accountant is calculating tuition fees for the undergraduate student.");
    }

    @Override
    public void visit(GraduateStudent student) {
        System.out.println("Accountant is calculating tuition fees for the graduate student.");
    }
}