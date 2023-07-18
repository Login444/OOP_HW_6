package org.example.cw13.model;

import java.time.LocalDate;

public abstract class User {
    public String fio;
    public LocalDate dateBirth;


    public User(String fio, LocalDate dateBirth) {
        this.fio = fio;
        this.dateBirth = dateBirth;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public LocalDate getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(LocalDate dateBirth) {
        this.dateBirth = dateBirth;
    }

    @Override
    public String toString() {
        return "User{" +
                "fio='" + fio + '\'' +
                ", dateBirth=" + dateBirth +
                '}';
    }
}
