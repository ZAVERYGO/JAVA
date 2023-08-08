package com.Colltction.List.Exercise2.Comparator;

import com.Colltction.List.Exercise2.Student;

import java.util.Comparator;

public class SurNameComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getSurname().compareTo(o2.getSurname());
    }
}
