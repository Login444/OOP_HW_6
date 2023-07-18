package org.example.cw13.view;

import org.example.cw13.controller.Controller;
import org.example.cw13.model.Student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class StudentView {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Student student = new Student("Jones " + i, LocalDate.now(), i);
            students.add(student);
        }
        Controller controller = new Controller();
        controller.send(students);

        controller.show();

    }
}
