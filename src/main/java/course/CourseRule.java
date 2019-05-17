package course;

import org.siani.itrules.TemplateEngine;

import java.util.*;

public class CourseRule {

    public static final String TEMPLATE = "C:\\Users\\TDRS\\IdeaProjects\\itrulesplayground\\src\\main\\java\\rules\\course.itr";

    public static void main(String[] args) {
        String result = TemplateEngine.with(TEMPLATE).render(courseContent());
        System.out.println(result);
    }

    private static CourseContent courseContent() {
        return new CourseContent(
                teacher(),
                new Subject("Maths"),
                students()
        );
    }

    private static Teacher teacher() {
        return new Teacher("Pepa", Sex.FEMALE, new Subject("Maths"), date(1980, Calendar.JULY, 6));
    }

    private static Student[] students() {
        return new Student[]{
                new Student("Pepe", date(1997, Calendar.APRIL, 22), "4225", 9.5),
                new Student("Maria", date(1997, Calendar.SEPTEMBER, 1), "7895", 10.)
        };
    }

    private static Date date(int year, int month, int day) {
        return new GregorianCalendar(year, month, day).getTime();
    }

    public static class CourseContent {

        private Person teacher;
        private Student[] students;
        private Subject subject;

        public CourseContent(Teacher teacher, Subject subject, Student... students) {
            this.teacher = teacher;
            this.students = students;
            this.subject = subject;
        }

    }

}
