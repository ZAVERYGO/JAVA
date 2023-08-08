package com.Colltction.List.Exercise2;

import java.util.List;

public final class StudentUtil {
    private StudentUtil(){

    }
    public static Student getBestStudent(List<Student> students){
        Student bestStudent = null;
        for (Student student : students) {
            if(bestStudent.getAverageMark() < student.getAverageMark()){
                bestStudent = student;
            }
        }
        return bestStudent;
    }
}
