import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class MyFramework {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {

        Class<?> bookClass = Class.forName("Book");
        Constructor<?> constructor =  bookClass.getConstructor();
        Book book = (Book) constructor.newInstance();           /** Book 인스턴스 생성 (파라미터는 생성자에따라서)**/

        /** (1) 그냥 클래스 변수의 경우 **/
        Field a = Book.class.getDeclaredField("A");       /**파라미터는 필드 이름 넣으면 해당 값 가져올 수 있음 **/
        a.setAccessible(Boolean.TRUE);
        System.out.println(a.get(book));    /** 내부 파라미터는 인스턴스 이름 **/
        a.set(null, "BBBB");
        System.out.println(a.get(book));

        /** (2) 메소드 실행하기 **/
        Method m = Book.class.getDeclaredMethod("c");
        m.setAccessible(true);
        m.invoke(book);     /** 메소드 실행하기. 내부 파라미터는 **/

        /** invoke의 리턴값은 Object로 나오게 됨 **/


        Arrays.stream(Book.class.getDeclaredFields()).forEach(f -> {
            Arrays.stream(f.getAnnotations()).forEach(x -> {
                if (x instanceof MyAnnotation) {
                    MyAnnotation myAnnotation = (MyAnnotation) x;
                    System.out.println(myAnnotation.value());
                    System.out.println(myAnnotation.number());
                }
            });
        });
    }

}
