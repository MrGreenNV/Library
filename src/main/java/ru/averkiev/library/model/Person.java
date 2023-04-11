package ru.averkiev.library.model;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class Person {
    private int id;

    @Pattern(regexp = "[A-Z][a-z]+ [A-Z][a-z]+ [A-Z][a-z]+", message = "The FullName should be like this: Lastname Firstname Patronymic")
    @Min(value = 8, message = "Full name should be fuller")
    @NotEmpty(message = "The FullName not should be empty")
    private String fullName;

    @Size(min = 1900, max = 2017, message = "Year should be between 1900 and 2017 character")
    @Pattern(regexp = "\\d{4}", message = "Year should be valid - YYYY")
    private int yearOfBirthday;

    public Person(int id, String fullName, int date) {
        this.id = id;
        this.fullName = fullName;
        this.yearOfBirthday = date;
    }

    public Person() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getYearOfBirthday() {
        return yearOfBirthday;
    }

    public void setYearOfBirthday(int yearOfBirthday) {
        this.yearOfBirthday = yearOfBirthday;
    }
}
