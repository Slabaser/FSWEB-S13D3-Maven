package org.example;

public class Person {
    private String firstName;
    private int age;
    private String lastName;

    private String email;
    private String phone;
    private String address;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;

    }

    public Person(String firstName, String lastName, int age, String email, String phone, String address) {
        this(firstName, lastName, age);
        this.email = email;
        this.phone = phone;
        this.address = address;

    }

    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }

    public String getLastName() {
        return lastName;
    }

    public boolean isTeen() {
        return age >= 13 && age <= 19;
    }


}
