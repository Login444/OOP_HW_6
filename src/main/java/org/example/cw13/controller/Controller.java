package org.example.cw13.controller;

import org.example.cw13.data.UserService;
import org.example.cw13.model.Student;

import java.util.List;

public class Controller {

    UserService userService = new UserService(); // для корректной работы класса, добавил в класс пустой объект класса UserService



    public void send(List<Student> students) {
        // UserService userService = new UserService(); т.к. пустой объект уже создан, нет необходимости создавать его снова
        userService.create(students); // а здесь добавляем в него список студентов
    }

    public List<Student> read(){
    // UserService userService = new UserService(); // в старом варианте метода, мы создавали новую пустую переменную
    // return userService.read(); // следовательно возвращалось значение пустой переменной
        return userService.read(); // теперь метод возвращет значения из списка студентов, положенные в поле userService ранее
    }

    public void show(){
        for (Student student : userService.read()) { // для правильного выполнения программы, добавил метод show, для вывода данных в консоль
            System.out.println(student);
        }
    }
}
