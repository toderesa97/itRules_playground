import org.siani.itrules.TemplateEngine;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class PersonRule {

    public static void main(String[] args) {
        String result = TemplateEngine.with("C:\\Users\\TDRS\\IdeaProjects\\itrulesplayground\\src\\main\\java\\rules\\person.itr").render(pau());
        System.out.println(result);
    }

    private static Person pau() {
        return new Person("Pau Gasol", date(1980, Calendar.JULY, 6), "spain");
    }

    public static class Person {
        private String name;
        private Date birthday;
        private String country;

        public Person(String name, Date birthday, String country) {
            this.name = name;
            this.birthday = birthday;
            this.country = country;
        }
    }

    private static Date date(int year, int month, int day) {
        return new GregorianCalendar(year, month, day).getTime();
    }



}
