package com.example.randomuser;

public class Person {
    private String name;
    private String age;
    private String address;
    private String email;

    public Person() {

    }

    public Person(String name, String age, String address, String email) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.email = email;
    }

    public void greet() {
        System.out.println("Hello, my name is "+name +". I live at "+address + ". You can reach out via "+email);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
