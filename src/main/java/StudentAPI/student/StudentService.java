package StudentAPI.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {
    private final StudentInterface studentInterface;
    @Autowired
    public StudentService(StudentInterface studentInterface) {
        this.studentInterface = studentInterface;
    }

    public List<Student> getStudents()
    {
        return studentInterface.findAll();
    }
}
