package com.Colltction.List.Exercise2;
/*
2. Создать класс Student, представляющий собой ученика. Добавить ему данные об имени, фамилии, возрасте и среднем балле за год.
        Создать список (List) учеников. Найти и вывести ученика с самым высоким средним баллом используя итератор.
        Отсортировать и вывести список учеников по полному имени (имя + фамилия), возрасту и среднему баллу, используя компараторы.
*/

import com.Colltction.List.Exercise2.Comparator.AgeComparator;
import com.Colltction.List.Exercise2.Comparator.AverageMarkComparator;
import com.Colltction.List.Exercise2.Comparator.NameComparator;
import com.Colltction.List.Exercise2.Comparator.SurNameComparator;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Nikita", "Kozich", 19, 7.8));
        students.add(new Student("Anton", "Baranov", 6, 2.8));
        students.add(new Student("Zhenya", "Marader", 89, 1.8));
        students.add(new Student("Kiril", "Sadovskiy", 34, 9.8));
        students.add(new Student("Ivan", "Kondrashov", 20, 8.0));
        students.sort(new AgeComparator());
        System.out.println(students);
        System.out.println();

        students.sort(new NameComparator());
        System.out.println(students);
        System.out.println();

        students.sort(new SurNameComparator());
        System.out.println(students);
        System.out.println();

        students.sort(new AverageMarkComparator());
        System.out.println(students);
        System.out.println();

        students.sort(new NameComparator().thenComparing(new AgeComparator()));
        System.out.println(students);
        System.out.println();

        students.sort(new AgeComparator().thenComparing(new NameComparator()));
        System.out.println(students);
    }
}
