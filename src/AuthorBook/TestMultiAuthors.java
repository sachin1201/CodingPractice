package AuthorBook;

public class TestMultiAuthors {

    public static void main(String[] args) {
        Author a1 = new Author("ram", "ram@gmail.com", 'm');
        Author a2 = new Author("shyam", "syam@gmail.com", 'm');
        Author[] authors = new Author[3];
        authors[0] = a1;
        authors[1] = a2;
        authors[2] = new Author("sita", "sita@gmail.com", 'f');

        MultipleAuthorBook obj = new MultipleAuthorBook("Java Advance", authors, 200);

    }

}
