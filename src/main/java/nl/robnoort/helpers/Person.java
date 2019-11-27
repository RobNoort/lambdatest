package nl.robnoort.helpers;

import java.util.List;

public class Person {

    private String name;
    private List<String> addresses;
    private int age;

    public Person(String name, List<String> addresses, int age) {
        this.name = name;
        this.addresses = addresses;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<String> addresses) {
        this.addresses = addresses;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }

}
