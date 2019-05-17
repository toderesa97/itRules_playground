package course;

import java.util.Date;

public class Student implements Person {

    private String name;
    private Date birthday;
    private String id;
    private Double mark;

    public Student(String name, Date birthday, String id, Double mark) {
        this.name = name;
        this.birthday = birthday;
        this.id = id;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public Date getBirthday() {
        return birthday;
    }
}
