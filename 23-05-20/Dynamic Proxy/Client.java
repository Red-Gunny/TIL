import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Client {

    public static void main(String[] args) {

        PatternInterface patternInterface = (PatternInterface) Proxy.newProxyInstance(
                PatternInterface.class.getClassLoader(),
                new Class[]{PatternInterface.class},
                new InvocationHandler() {
                    RealSubject realSubject = new RealSubject();
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("Before method call");
                        Object invoke = method.invoke(realSubject, args);
                        System.out.println("After method call");
                        return invoke;
                    }
                }
        ); // 반환타입은 Object 타입


    }

}
