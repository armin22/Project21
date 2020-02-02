package com.company.Employee;


public class Main {


    public static void main(String[] args) {

        Employee emp = new Employee();
        emp.name = "Tom";
        emp.age = 24;
        emp.salary = 655520;

        Developer d = new Developer();
        d.name = "Sara";
        d.age = 35;
        d.salary = 750000;

        Qa q = new Qa();
        q.name = "Jack";
        q.age = 30;
        q.salary = 800000;

        emp.getInfo();
        d.getInfo();
        q.getInfo();
    }

}
