package com.peter.demo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {

    public List<Student> findAllStudents() {
     return List.of(
            new Student(
                    "Peter",
                    "Godwin",
                    LocalDate.now(),
                    "godwinapeter@gmail.com",
                    18


                                ),

             new Student(
                     "Student3",
                     "Godwin",
                     LocalDate.now(),
                     "godwinapeter@gmail.com",
                     15

                        )
     );


    }
}
