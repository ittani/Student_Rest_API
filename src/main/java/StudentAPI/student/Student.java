package StudentAPI.student;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.Period;

@Entity //is for Hibernate
@Table
public class Student {
    @Id
    @SequenceGenerator(
            name="student_s",
            sequenceName="student_s",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_s"
    )
    private long id;
    private String first, last, email;
    @Transient
    private Integer age;
    private LocalDate dba;

    public Student() {}

    public Student(long id,
                   String first,
                   String last,
                   String email,
                   LocalDate dba) {
        this.id = id;
        this.first = first;
        this.last = last;
        this.email = email;
        this.dba = dba;
    }

    public Student(String first,
                   String last,
                   String email,
                   LocalDate dba) {
        this.first = first;
        this.last = last;
        this.email = email;
        this.dba = dba;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return Period.between(this.dba, LocalDate.now()).getYears();
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public LocalDate getDba() {
        return dba;
    }

    public void setDba(LocalDate dba) {
        this.dba = dba;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", first='" + first + '\'' +
                ", last='" + last + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", dba=" + dba +
                '}';
    }
}

