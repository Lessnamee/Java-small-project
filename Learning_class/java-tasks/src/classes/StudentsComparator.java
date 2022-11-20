package classes;

import java.util.Comparator;

public class StudentsComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {

        return o2.sum() - o1.sum();
    }
}

