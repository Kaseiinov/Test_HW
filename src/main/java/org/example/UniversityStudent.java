package org.example;

public class UniversityStudent extends Student {

    public UniversityStudent(String name, int grade) {
        super(name, grade);
    }

    @Override
    public void getInfo() {
        System.out.printf("Student university name -> %s, grade -> %s ", getName(), getGrade());
        System.out.println();
    }

}
