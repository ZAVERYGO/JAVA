package com.Colltction.List.Exercise2.Comparator;

import com.Colltction.List.Exercise2.Student;

import java.util.Comparator;

public class AverageMarkComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return Double.compare(o1.getAverageMark(), (o2.getAverageMark()));
    }
}
