package OOP.clases;

import OOP.Books.Book;

public class mainClases {
    public static void main(String[] args) {


        Book book1 = new Book();

        book1.author= "Eminescu";
        book1.setNumberOfPages(50);


        System.out.println("Autorul cartii este " + book1.author+" iar numarul de pagini este " +book1.getNumberOfPages());


        OOP.AnotherBooks.Book bookFromAnother = new OOP.AnotherBooks.Book();//accesarea fara import

    }

}
