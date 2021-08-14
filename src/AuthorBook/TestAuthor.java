package AuthorBook;

public class TestAuthor {

    public static void main(String[] args) {
        Author obj = new Author("ram","ram@gmail.com", 'm');

        System.out.println(obj);
        obj.setEmail("shyam@gmail.com");
        System.out.println(obj.getEmail());


    }

}
