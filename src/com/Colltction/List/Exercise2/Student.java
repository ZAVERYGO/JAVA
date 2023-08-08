package com.Colltction.List.Exercise2;

public class Student {
    private String name;
    private String surname;
    private int age;
    private double averageMark;

    public Student(String name, String surname, int age, Double averageScore) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.averageMark = averageScore;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", averageMark=" + averageMark +
                "}\n";
    }
}
