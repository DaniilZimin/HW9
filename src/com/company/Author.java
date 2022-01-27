package com.company;

public class Author {
    private String name;
    private String surname;

    public Author(String nameAuthor, String surnameAuthor) {
        this.name = nameAuthor;
        this.surname = surnameAuthor;

    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
