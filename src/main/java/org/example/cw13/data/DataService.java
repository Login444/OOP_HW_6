package org.example.cw13.data;

import org.example.cw13.model.Student;

import java.util.List;

public interface DataService {

    void create(List<Student> students);

    List<Student> read();
}
