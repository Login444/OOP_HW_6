package org.example.cw13.data;

import org.example.cw13.model.Student;

import java.util.ArrayList;
import java.util.List;

public class UserService implements DataService{
    List<Student> studentList = new ArrayList<>();

    @Override
    public void create(List<Student> students) {
        this.studentList.addAll(students);
    }

    @Override
    public List<Student> read() {
        return studentList;
    }
}
