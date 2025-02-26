/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q1;

/**
 *
 * @author Nguyen Vo Kieu My_CE171644
 */
class Person {
    private String name;
    private int age;

    // Default constructor
    public Person() {
        this.name = "Mark";
        this.age = 25;
    }

    // Parameterized constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to get name in uppercase
    public String getName() {
        return name.toUpperCase();
    }

    // Method to get age
    public int getAge() {
        return age;
    }

    // Method to set age
    public void setAge(int age) {
        this.age = age;
    }

    // Method to show person data
    public void showData() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}