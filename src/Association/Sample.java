package Association;

public class Sample {
    public static void main(String[] args) {
        Author author=new Author("Rahul",79,2255);
        Book book=new Book("kuttoosanum dakinium",1000,"OO7",author);
        book.display();
    }
}
