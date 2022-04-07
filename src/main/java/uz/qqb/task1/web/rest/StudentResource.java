package uz.qqb.task1.web.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.qqb.task1.model.Student;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")

public class StudentResource {

//    @GetMapping("/students")
//    public String hello(){
//        return "Hello";
//    }

//    @RequestMapping(value = "/students",method = RequestMethod.GET)
//    public String hello(){
//        return "Hello2";
//    }

    @GetMapping("/students/all")
    public ResponseEntity getAll() {
        Student student1 = new Student(1L, "Aziz", "Azizov", "1-kurs");
        Student student2 = new Student(2L, "Aziza", "Azizova", "1-kursa");
        Student student3 = new Student(3L, "Azizaa", "Azizovaa", "1-kursaa");

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);

        return ResponseEntity.ok(students);
    }

    @GetMapping("/students/{id}")
    public ResponseEntity getOne(@PathVariable Long id) {
        Student student1 = new Student(id, "Aziz", "Azizov", "1-kurs");
        return ResponseEntity.ok(student1);
    }

    @GetMapping("/students")
    public ResponseEntity getOne(@RequestParam Long id,
                                 @RequestParam String name,
                                 @RequestParam String lastName,
                                 @RequestParam String course) {
        Student student1 = new Student(id, name, lastName, course);
        return ResponseEntity.ok(student1);
    }

    @DeleteMapping("/students/{id}")
    public ResponseEntity delete(@PathVariable Long id) {
        return ResponseEntity.ok("Deleted");

    }

    @PostMapping("/students")
    public ResponseEntity create(@RequestBody Student student) {
        return ResponseEntity.ok(student);
    }

    @PutMapping("/students/{id}")
    public ResponseEntity update(@PathVariable Long id, @RequestBody Student studentNew) {
        Student student = new Student(1L, "Aziz", "Azizov", "1-kurs");
        student.setId(id);
        student.setName(studentNew.getName());
        student.setLastname(studentNew.getLastname());
        return ResponseEntity.ok(student);
    }

}
