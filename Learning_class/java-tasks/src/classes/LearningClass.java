package classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class LearningClass{
    private Teacher teacher;

    private List<Student> persons = new ArrayList<>();

    private void sort_students(){
        Collections.sort(this.persons, new StudentsComparator());
    }
    public LearningClass(Teacher teacher) {
        super();
        this.teacher = teacher;
    }

    public void addStudent(Student student){
        persons.add(student);
    };

    public int getStudentsNumbers(){
        return persons.size();
    }

    public Student getExactStudentFromIndex(int index){
        return persons.get(index);
    }

    public Student getCopyOfStudentFromIndex(int index1){

        Student found_student = persons.get(index1);
        Student student = new Student(found_student);

        return student;
    }

    @Override
    public String toString() {
        String people = "";
        this.sort_students();
        for(Student person: this.persons){
            people = people + person + "\n";
        }

        return teacher + "\n" +  people;
    }


}
