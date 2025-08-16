package org.example;

public class Main {
    public static void main(String[] args) {

        Wall wall = new Wall(5,4);
        System.out.println("area= " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());

        Person person1 = new Person("John", "Doe", 20);
        System.out.println("Firstname: " + person1.getFirstName());
        System.out.println("Lastname: " + person1.getLastName());
        System.out.println("Age: " + person1.getAge());
        System.out.println("Is teen? " + person1.isTeen());

        Person person2 = new Person("Jane", "Smith", 16, "jane@example.com", "555-1234", "Ankara");
        System.out.println("Firstname: " + person2.getFirstName());
        System.out.println("Is teen? " + person2.isTeen());
        System.out.println("Lastname: " + person2.getLastName());
        System.out.println("Age: " + person2.getAge());

    }
}
