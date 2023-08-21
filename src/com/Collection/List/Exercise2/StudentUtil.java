package com.Collection.List.Exercise2;

import java.util.Iterator;
import java.util.List;

public final class StudentUtil {
    private StudentUtil(){

    }
    public static Student getBestStudent(List<Student> students){
        Student bestStudent = null;
        Iterator<Student> iterator = students.iterator();
        while(iterator.hasNext()){
            Student student = iterator.next();
            if(bestStudent == null || bestStudent.getAverageMark() < student.getAverageMark()){
                bestStudent = student;
            }
        }
        /*for (Student student : students) {
            if(bestStudent == null || bestStudent.getAverageMark() < student.getAverageMark()){
                bestStudent = student;
            }
        }*/
        return bestStudent;
    }
}
