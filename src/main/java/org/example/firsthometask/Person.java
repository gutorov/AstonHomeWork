package org.example.firsthometask;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class Person {
    private String firstName;
    private String secondName;
    private int age;
    private String email;
    private final static String EMAIL_PATTERN = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
    private final static String NAME_PATTERN = "[a-zA-Z]";

    public void setFirstNameName(String name) {
        this.firstName = name;
    }

    public void setSecondName(String name) {
        if (!name.matches(NAME_PATTERN)) {
            System.out.println("Name is not valid");
            return;
        }
        this.secondName = name;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Age cannot be less than zero");
            return;
        }
        this.age = age;

    }

    public void setEmail(String email) {
        if (!email.matches(EMAIL_PATTERN)) {
            System.out.println("Email is not valid");
            return;
        }
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.setSecondName("Petrov");
        person.setFirstNameName("343");
        person.setAge(24);
        person.setEmail("a.petrovvvvv@mail.ru");
        System.out.println(person);

        System.out.println(person.getClass().getClassLoader());
    }
}
