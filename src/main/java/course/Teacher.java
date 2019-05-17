package course;

import java.util.Date;

public class Teacher implements Person {

    private String name;
    private Subject subject;
    private Date birthday;
    private Sex sex;
    private Student[] students;

    public Teacher(String name, Sex sex, Subject subject, Date birthday, Student... students) {
        this.name = name;
        this.subject = subject;
        this.birthday = birthday;
        this.sex = sex;
    }

    public boolean isMale() {
        return this.sex == Sex.MALE;
    }

    public String getName() {
        return name;
    }

    public Subject getSubject() {
        return subject;
    }

    public Date getBirthday() {
        return birthday;
    }
}
