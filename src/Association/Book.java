package Association;

public class Book {
    String name;
    int price;
    String id;
    Author obj;//obj is an instance of class Author.This is a "Has-A relationship".the members in the class author can be accecced by this object.

    public Book(String name, int price, String id, Author obj) {
        this.name = name;
        this.price = price;
        this.id = id;
        this.obj = obj;
    }

    public void display() {
        System.out.println("name of book is :"+name+" "+"price of the book is :"+price);
        System.out.println("name of the author is :"+obj.name);
    }
}