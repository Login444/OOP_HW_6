package org.example.cw13.model;

import java.time.LocalDate;

public class Student extends User {
    private Integer studentId; // следуя принципу открытости/закрытости, добавил полю приватный модификатор доступа
    // что бы ни у кого не было возможности менять id студента


    public Student(String fio, LocalDate dateBirth, Integer stidentId) {
        super(fio, dateBirth);
        this.studentId = stidentId;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stidentId=" + studentId +
                ", fio='" + fio + '\'' +
                ", dateBirth=" + dateBirth +
                '}';
    }
}
