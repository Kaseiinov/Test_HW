package org.example;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Student[] students = new Student[3];

        students[0] = new SchoolStudent("School 1", 1);
        students[1] = new UniversityStudent("Univer 1", 5);
        students[2] = new SchoolStudent("School 2", 9);

        for (int i = 0; i < students.length; i++) {
            students[i].getInfo();
        }


    }

}

