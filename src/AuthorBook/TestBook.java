package AuthorBook;

public class TestBook {

    public static void main(String[] args) {
        Author a = new Author("ram","ram@gmail.com",'m');
        Book b = new Book("java advance",a,110);
        System.out.println(b);
        System.out.println(a);
        a.setEmail("shyam@gmail.com");
        System.out.println(a.getEmail());

    }

}
