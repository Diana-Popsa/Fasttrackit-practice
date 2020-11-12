package ro.fasttrackit.temaCurs7.Generics;

import ro.fasttrackit.temaCurs7.password_check.Student;

import java.util.ArrayList;
import java.util.List;

public class GenericDemo {
    public static void main(String[] args) {
        List<? extends Human> newHuman = createStudentList();
        // first I tried List<Human> newHuman = createStudentList();
        // not working - createStudentList must return Human
        //Solution -> changed <Human> to <? extends Human> and class Student implements Human


    }

    public static List<Student> createStudentList() {
        Student s1 = new Student();
        s1.setName("Sorin");
        s1.setGrade(8);

        Student s2 = new Student();
        s2.setName("Alina");
        s2.setGrade(7);

        Student s3 = new Student();
        s3.setName("Olivia");
        s3.setGrade(5);

        List<Student> studentList = new ArrayList<>();
        studentList.add(s1);
        studentList.add(s1);
        studentList.add(s3);
        return studentList;

        // 1.3 After Box <Human> -> Human is an instance(class), and we can use only generics between the diamond operators.
        // 1.4 Nothing changed. We already have the <? extends Human> so the Human interface was already included.
    }
}
