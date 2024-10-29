package StudentAPI.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentInterface extends JpaRepository<Student, Long> {
}
