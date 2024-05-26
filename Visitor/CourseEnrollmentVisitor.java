public class CourseEnrollmentVisitor implements Visitor {
    @Override
    public void visit(UnderGraduateStudent student) {
        System.out.println("Registrar is enrolling the undergraduate student in courses.");
    }

    @Override
    public void visit(GraduateStudent student) {
        System.out.println("Registrar is enrolling the graduate student in courses.");
    }
}