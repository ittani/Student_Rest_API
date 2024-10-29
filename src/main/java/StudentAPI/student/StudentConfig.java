package StudentAPI.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentInterface studentInterface)
    {
        return args -> {
            Student Ittani=  new Student(
                    1L,
                    "ittani",
                    "Maemo",
                    "ittani90@gmail.com",
                    LocalDate.of(2000, Month.FEBRUARY, 1)
            );
            Student Moddah=  new Student(
                    2L,
                    "Moddah",
                    "Maemo",
                    "Moddah.Moddy@gmail.com",
                    LocalDate.of(2005, Month.JANUARY, 1)
            );
            Student Matodzi=  new Student(
                    3L,
                    "Matodzi",
                    "Maemo",
                    "Bluff@gmail.com",
                    LocalDate.of(1999, Month.MARCH, 1)
            );
            Student Thompho=  new Student(
                    4L,
                    "Thompho",
                    "Mthenga",
                    "Thompho@gmail.com",
                    LocalDate.of(2007, Month.JANUARY, 1)
            );
            Student Gippe=  new Student(
                    5L,
                    "Gippe",
                    "Nthite",
                    "GippeNth02@gmail.com",
                    LocalDate.of(2001, Month.FEBRUARY, 1)
            );
            studentInterface.saveAll(List.of(Ittani,Moddah,Matodzi, Thompho, Gippe));

        };
    }
}