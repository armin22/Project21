package com.company.Employee;

public class Employee {
    String name;
    String surname;
    int age;

    public String getName(String tom) {

        return name;
    }

    public String getSurname(String s) {
        return surname;
    }


    public Employee(String name, int age, String surname) {
    }

    public Employee(String name) {
        this.name = name;
    }
    public Employee() {

    }

    public Employee(int age) {
        this.age = age;
    }

    public void getInfo() {
        System.out.println("");
    }

    public static void printName(Employee emp) {
    }
//class Qa extends Employee{
////        public QA(String name) {
////            super(name);
//        }
//}


//    class Developer extends Employee {
////        public Developer(){
////            super(name, age, surname);
//
//    }
}



