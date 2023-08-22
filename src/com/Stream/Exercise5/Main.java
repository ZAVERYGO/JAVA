package com.Stream.Exercise5;

import java.util.Comparator;
import java.util.List;

/*5. Дан класс Person с полями firstName, lastName,
        age.
        Вывести полное имя самого старшего человека, у
        которого длина этого имени не превышает 15
        символов.*/
public class Main {
    public static void main(String[] args) {
        List<Person> list = List.of(
                new Person("Ivan", "Ivanov", 20),
                new Person("Petr", "Petrov", 25),
                new Person("Sveta", "Svetikova", 33),
                new Person("Kate", "Ivanova", 25),
                new Person("Slava", "Slavikov", 18),
                new Person("Arni", "Kutuzov12324", 56)
        );
        list.stream()
                .filter(person -> (person.getFirstName().length() + person.getLastName().length()) <= 15)
                .max(Comparator.comparing(Person::getAge))
                .ifPresent(person -> System.out.println(person.getFirstName() + " " + person.getLastName()));
    }
}
