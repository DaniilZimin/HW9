package com.company;

public class Main {

    public static void main(String[] args) {
        Author artem = new Author("Артём", "Каменистый");
        Author dmitriy = new Author("Дмитрий", "Глуховский");

        Book devyatyy = new Book("Девятый", artem, 2012);
        Book metro = new Book("Метро_2033", dmitriy, 2005);

        metro.setYearOfPublication(2007);
    }
}
