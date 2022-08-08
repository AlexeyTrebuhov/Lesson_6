package org.example;

public class Person {
    private String name;
    private String surname;
    private String year;
    private String adress;

    public Person(String name, String surname, String year, String adress) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year='" + year + '\'' +
                ", adress='" + adress + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getYear() {
        return year;
    }

    public String getAdress() {
        return adress;
    }
}