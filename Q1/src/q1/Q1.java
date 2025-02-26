/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q1;

import java.util.Scanner;

/**
 *
 * @author Nguyen Vo Kieu My_CE171644
 */
public class Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose an option (1-3):");
        System.out.println("1: Create a Person using default constructor and print name in uppercase.");
        System.out.println("2: Create a Person using default constructor, update age, and print new age.");
        System.out.println("3: Create a Person using parameterized constructor and display data.");
        int option = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        switch (option) {
            case 1:
                Person person1 = new Person();
                System.out.println("Person name: " + person1.getName());
                break;
            case 2:
                Person person2 = new Person();
                System.out.print("Enter new age: ");
                int newAge = scanner.nextInt();
                person2.setAge(newAge);
                System.out.println("New age: " + person2.getAge());
                break;
            case 3:
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                System.out.print("Enter age: ");
                int age = scanner.nextInt();
                Person person3 = new Person(name, age);
                person3.showData();
                break;
            default:
                System.out.println("Invalid option. Please choose 1, 2, or 3.");
        }
        scanner.close();
    }
}