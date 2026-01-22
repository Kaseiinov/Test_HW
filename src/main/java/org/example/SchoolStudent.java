package org.example;

public class SchoolStudent extends Student {

    public SchoolStudent(String name, int grade) {
        super(name, grade);
    }

    @Override
    public void getInfo() {
        System.out.printf("Student name -> %s, grade -> %s ", getName(), getGrade());
        System.out.println();
    }

}
