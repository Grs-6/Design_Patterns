public class Main {
    public static void main(String[] args) {
        IVisitor courseEnrollmentVisitor = new CourseEnrollmentVisitor();
        IVisitor tuitionCalculationVisitor = new TuitionCalculationVisitor();

        IStudent undergraduate = new UnderGraduateStudent();
        IStudent graduate = new GraduateStudent();

        System.out.println("Operations for undergraduate student:");
        undergraduate.accept(courseEnrollmentVisitor);
        undergraduate.accept(tuitionCalculationVisitor);
        System.out.println();

        System.out.println("Operations for graduate student:");
        graduate.accept(courseEnrollmentVisitor);
        graduate.accept(tuitionCalculationVisitor);
        System.out.println();
    }
}
