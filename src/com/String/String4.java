package com.String;


import java.util.Scanner;
/*4. Написать функцию, принимающую в качестве параметров имя, фамилию и отчество и возвращающую инициалы
   в формате "Ф.И.О". Учесть, что входные параметры могут быть в любом регистре, а результирующая строка должна быть в верхнем.
*/
public class String4 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите фамилию:");
        String surname = console.nextLine();
        System.out.print("Введите имя:");
        String name = console.nextLine();
        System.out.print("Введите отчество:");
        String patronymic = console.nextLine();
        System.out.println(nameSurPat(surname, name, patronymic));
    }

    public static String nameSurPat(String surname, String name, String patronymic) {
        return (surname.trim().charAt(0) + "." + name.trim().charAt(0) + "." + patronymic.trim().charAt(0)).toUpperCase();
    }
}
