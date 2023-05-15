import java.util.Arrays;

public class Reflection {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {

        /** (1) 클래스타입의 인스턴스를 가져오는 방법 1 **/
        Class<Book> bookClass = Book.class;     // 클래스 타입의 인스턴스를 가져오기.

        /** (2) 클래스타입의 인스턴스를 가져오는 방법 2 **/
        Book book = new Book();
        Class<? extends Book> bClass = book.getClass();

        /** (3) 클래스 타입의 인스턴스를 가져오는 방법 3 **/
        Class.forName("Book");      // ClassNotFoundException이 발생할 수 있음.

        Object o = bookClass.getDeclaredField("author");
        System.out.println(o);
        //Arrays.stream(bookClass.getFields()).forEach(System.out::println);
    }

}
