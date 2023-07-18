package org.example.cw13.model;

import java.time.LocalDate;

public class Teacher extends User{
    private Integer teacherId;

    public Teacher(String fio, LocalDate dateBirth, Integer teacherId) {
        super(fio, dateBirth);
        this.teacherId = teacherId;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId=" + teacherId +
                ", fio='" + fio + '\'' +
                ", dateBirth=" + dateBirth +
                '}';
    }
}
