package classes;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    private List<Integer> grades = new ArrayList<>();

    public int sum(){
        int sum = 0;
        for(int grade: this.grades){
            sum = sum + grade;
        }
        return sum;
    }

    @Override
    public boolean equals(Object obj) {
        Student second_student = (Student) obj;
        int sum = 0;
        int sum1 = 0;
        for(int grade: this.grades){
            sum = sum + grade;
        }

        for(int grade: second_student.grades){
            sum1 = sum1 + grade;
        }
        if(sum == sum1){
            return true;
        }else{
            return false;
        }
    }

    public Student(Student student){
        super(student.getName(), student.getSurname());
        this.grades = new ArrayList();
    }


    public String getName() {
        return super.getName();
    }

    public String getSurname() {
        return super.getSurname();
    }


    public Student(String name, String surname) {
        super(name, surname);
    }

    private String getGradesAsString() {
        String grades_string = "";
        for(Integer grade: this.grades) {
            grades_string = grades_string + grade + ", ";
        }
        return grades_string;
    }

    public void addGrade(int grade){
            grades.add(grade);
    }

    @Override
    public String toString() {
        return super.toString() + "My grades are: " + this.getGradesAsString();
    }
}
