package org.example.studentproducer.Controller;

import java.util.List;

import org.example.studentproducer.Model.Student;
import org.example.studentproducer.Model.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    StudentRepository studentrep;

    @GetMapping("/retrieve")
    public List<Student> retrieveData() {
        return studentrep.findAll();
    }

    @GetMapping("/retrieve/{studentid}")
    public Student retrieve(@PathVariable int studentid) {
        Optional<Student> studentdata = studentrep.findById(studentid);
        if (studentdata.isPresent()) {
            return studentdata.get();
        } else {
            // Return null or throw an exception, depending on your use case
            return null;
        }
    }

    @PostMapping("/insert")
    public Student insertData(@RequestBody Student s) {
        return studentrep.save(s);
    }
}
