public class Book {
    public String  book_title, author;

    Book(String book_title, String author){
        
        this.book_title = book_title;
        this.author = author;
    }

    public String getBookTitle(){
        return book_title;
    }

    public String getAuthor(){
        return author;
    }

}
