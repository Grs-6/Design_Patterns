public class Main {
    public static void main(String[] args) {
        Visitor courseEnrollmentVisitor = new CourseEnrollmentVisitor();
        Visitor tuitionCalculationVisitor = new TuitionCalculationVisitor();

        Student undergraduate = new UnderGraduateStudent();
        Student graduate = new GraduateStudent();

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
